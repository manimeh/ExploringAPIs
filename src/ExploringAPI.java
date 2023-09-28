import GsonClasses.*;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExploringAPI
{
    private static final String NEWS_API_TOKEN = System.getenv("NEWS_API_TOKEN");
    private static final String NOVA_API_TOKEN = System.getenv("NOVA_API_TOKEN");

    public static void main(String[] args)
    {
        News news = getNews("fr");
        System.out.printf("News Article:\nTitle:%s\nText%s\n", news.getTitle(), news.getText());
        System.out.print("\nQuiz:\n"
                + getQuiz(2, "beginner", "English", news.getText()));
    }

    private static String getQuiz(Integer numOfQuest, String questDifficulty, String questLanguage, String newsText)
    {
        String prompt = String.format("Give me %s multiple choice questions on '%s'. The question should be in %s." +
                "The question should be at %s level of difficulty. Return your answer entirely in the form of a JSON" +
                "object. The JSON object should have a key named 'questions' which is an array of questions. Each " +
                "quiz question should include the choices, the answer, and a brief explanation of why the answer" +
                "is correct. Don't include anything other than the JSON. The JSON properties of each question should be" +
                " 'query (which is the question), 'choices, 'answer', and 'explanation'. The choices should not have " +
                "any ordinal value like A, B, C, D or a number like 1, 2, 3, 4. The answer should be the 0-indexed " +
                "number of the correct choice", numOfQuest.toString(), newsText, questDifficulty, questLanguage);

        Gson gson = new Gson();
        ChatRequest chatRequest = new ChatRequest();
        ChatMessage chatMessage = new ChatMessage();

        chatMessage.setRole("user");
        chatMessage.setContent(prompt);

        chatRequest.setModel("gpt-3.5-turbo");
        chatRequest.setMessages(new ChatMessage[]{chatMessage});

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.nova-oss.com/v1/chat/completions"))
                .header("Content-Type", "application/json")
                .header("Authorization", String.format("Bearer %s", NOVA_API_TOKEN))
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(chatRequest)))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response;
        ChatResponse chatAnswer;

        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            chatAnswer = gson.fromJson(response.body(), ChatResponse.class);
            return chatAnswer.getChoices()[0].getMessage().getContent();
        }
        catch (IOException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

    private static News getNews(String language)
    {
        Gson gson = new Gson();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format("https://api.worldnewsapi.com/search-news?number=1" +
                        "&sort=publish-time&sort-direction=DESC&language=%s&api-key=%s", language, NEWS_API_TOKEN)))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response;

        try
        {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), NewsResponse.class).getNews()[0];
        }
        catch (IOException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
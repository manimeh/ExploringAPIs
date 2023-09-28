package APIObjects;

public class ChatResponse {
    private String id;
    private AnswerChoice[] choices;

    public void setId(String id) {
        this.id = id;
    }

    public void setChoices(AnswerChoice[] choices) {
        this.choices = choices;
    }

    public String getId() {
        return id;
    }

    public AnswerChoice[] getChoices() {
        return choices;
    }
}

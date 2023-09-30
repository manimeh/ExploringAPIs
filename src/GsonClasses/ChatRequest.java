package GsonClasses;

public class ChatRequest
{
    private String model;
    private ChatMessage[] messages;

    public void setModel(String model) {
        this.model = model;
    }

    public void setMessages(ChatMessage[] messages) {
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public ChatMessage[] getMessages() {
        return messages;
    }
}

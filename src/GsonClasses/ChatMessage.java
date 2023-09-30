package GsonClasses;

public class ChatMessage {
    private String role;
    private String content;

    public void setRole(String role) {
        this.role = role;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getRole() {
        return role;
    }
}

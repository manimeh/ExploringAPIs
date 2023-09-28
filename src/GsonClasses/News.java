package APIObjects;

public class News
{
    private String text;
    private String title;

    public void setText(String text) {
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public String getTitle() {
        return title;
    }
}

package APIObjects;

public class NewsResponse {
    private News[] news;

    public void setNews(News[] news) {
        this.news = news;
    }

    public News[] getNews() {
        return news;
    }
}

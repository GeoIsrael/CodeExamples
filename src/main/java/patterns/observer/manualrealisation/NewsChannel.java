package patterns.observer.manualrealisation;

import lombok.Data;

@Data
public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
    }
}
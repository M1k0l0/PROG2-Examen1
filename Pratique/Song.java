package Pratique;

import java.time.Duration;

public abstract class Song{
    protected static String id;
    private String title;
    private String category;
    private Duration duration;

    public Song(String title, String category, Duration duration) {
        this.title = title;
        this.category = category;
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

}

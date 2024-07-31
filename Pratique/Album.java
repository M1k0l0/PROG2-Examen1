package Pratique;

import java.time.LocalDate;

public class Album {
    private Artist artist;
    private String id;
    private String name;
    private LocalDate releaseDate;

    public Album(Artist artist, String id, String name, LocalDate releaseDate) {
        this.artist = artist;
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}

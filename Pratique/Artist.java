package Pratique;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Artist {
    private String id;
    private String stageName;
    private LocalDate debutDate;
    private String nationality;
    private List<Song> song= new ArrayList<Song>();

    public Artist(String id, String stageName, LocalDate debutDate, String nationality) {
        this.id = id;
        this.stageName = stageName;
        this.debutDate = debutDate;
        this.nationality = nationality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public LocalDate getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(LocalDate debutDate) {
        this.debutDate = debutDate;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}

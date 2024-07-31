package Pratique;

import java.time.LocalDate;

public class SoloArtist extends Artist {
    private String lastname;
    private String firstName;
    private LocalDate birthDate;

    public SoloArtist(String id, String stageName, LocalDate debutDate, String nationality, String lastname, String firstName, LocalDate birthDate) {
        super(id, stageName, debutDate, nationality);
        this.lastname = lastname;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

package Pratique;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Group extends Artist {
    private List<SoloArtist> soloArtist = new ArrayList<SoloArtist>();

    public Group(String id, String stageName, LocalDate debutDate, String nationality, List<SoloArtist> soloArtist) {
        super(id, stageName, debutDate, nationality);
        this.soloArtist = soloArtist;
    }

    public List<SoloArtist> getSoloArtist() {
        return soloArtist;
    }

    public void setSoloArtist(List<SoloArtist> soloArtist) {
        this.soloArtist = soloArtist;
    }
}

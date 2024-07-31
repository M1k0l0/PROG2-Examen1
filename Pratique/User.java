package Pratique;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String lastName;
    private String firstName;
    private Playlist playlist;
    private List<Playlist> playlists = new ArrayList<>();

    public User(String lastName, String firstName, Playlist playlist, List<Playlist> playlists) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.playlist = playlist;
        this.playlists = playlists;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public boolean addToPlaylist(Playlist song){
        return playlists.add(new Playlist());
    }

    public List like(String like){
        for(Playlist playlist : playlists){
            if(like == "like"){
                playlists.remove(playlist);
            }
            else{
                playlists.add(playlist);
            }
        }
        return playlists;
    }
    public List removeById(Song id){
        for(Playlist playlist : playlists){
            if(id.equals(Song.id)){
                 playlists.remove(id);
            }
        }
        return playlists;
    }

    public List exclude(String genre){
        for(Playlist playlist : playlists){
            if(playlist.equals(genre)){
                playlists.remove(genre);
            }
        }
        return playlists;
    }

    public int getTotalLike(){
        int total = 0;
        for(Playlist playlist : playlists){
            if(playlist.equals("like")){
                total += 1;
            }
        }
        return total;
    }

    public int countPlaylist(Song song){
        int count = 0;
        for(Playlist playlist : playlists){
            if(playlist.equals(song)){
                count += 1;
            }
        }
        return count;
    }

}

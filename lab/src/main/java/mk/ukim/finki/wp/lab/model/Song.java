package mk.ukim.finki.wp.lab.model;


import lombok.Data;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Song {
    private Long trackId;
    String title;
    String genre;
    Integer releaseYear;
    public List<Artist> performers;
    private  Album album;

    public Song(String title, String genre, Integer releaseYear, Album album) {
        this.trackId = (long) (Math.random()*1000);
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = new ArrayList<>();
        this.album = album;
        //add albums maybe
    }
    public void addArtist(Artist performer){
        performers.add(performer);
    }
}


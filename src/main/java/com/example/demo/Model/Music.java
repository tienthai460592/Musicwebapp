package com.example.demo.Model;


public class Music {

    private String title;
    private int releaseYear;
    private Artist artist;
    private Genre genre;
    private String pic;

    public Music(String title, int releaseYear, Artist artist, Genre genre, String pic) {
        this.title = title.trim();
        this.releaseYear = releaseYear;
        this.artist = artist;
        this.genre = genre;
        this.pic = pic;
    }

    public Music(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Music(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Artist getArtist() {
        return artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getGenreName() {
        return genre.getName();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getPic() {
        return pic;
    }
}

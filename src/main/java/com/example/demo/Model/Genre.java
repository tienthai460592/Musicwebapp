package com.example.demo.Model;

import java.util.ArrayList;

public class Genre {
    private String name;
    private String description;
    private String picture;
    private ArrayList<Music> musics;
    private ArrayList<Artist> artists;

    public Genre(String name, String description, String picture) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        musics = new ArrayList<>();
        artists = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPicture() {
        return picture;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
    }

    public void addMusic(Music music) {
        musics.add(music);
    }


    public ArrayList<Artist> getArtistsOfGenre() {
        return artists;
    } // this method is used for connecting front and back

    public ArrayList<Music> getMusic() {
        return musics;
    }// this method is used ti connect front and back

    @Override
    public String toString() {
        return " " + name;
    }
}


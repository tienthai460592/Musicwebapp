package com.example.demo.Model;

import java.util.ArrayList;
import java.util.List;

public class Album extends Music {

    private ArrayList<Song> songs;
    private String type = "album";


    public Album(String name, int releaseYear, Artist artist, Genre genre, String pic) {
        super(name, releaseYear, artist, genre, pic);
        songs = new ArrayList<>();

    }


    public void addSong(Song song) {
        songs.add(song);
    }


    public List<Song> getSongsFromAlbum() {
        return songs;
    }


    public String getType() {
        return type;
    }
}

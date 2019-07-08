package com.example.demo.Model;

import java.util.ArrayList;

public class Artist {
    private String name;
    private String otherName;
    private String homeTown;
    private String born;
    private int activeSince;
    private String label;
    private ArrayList<Genre> genres;
    private String pic;
    private ArrayList<Single> singles;
    private ArrayList<Album> albums;


    public Artist(String name, String otherName, String homeTown, String born, int activeSince, String label, String pic) {
        this.name = name;
        this.otherName = otherName;
        this.homeTown = homeTown;
        this.born = born;
        this.activeSince = activeSince;
        this.label = label;
        genres = new ArrayList<>();
        this.pic = pic;
        singles = new ArrayList<>();
        albums = new ArrayList<>();
    }

    public Artist() {
    }

    public Artist(String name, String otherName, String homeTown, String born, int activeSince, String label) {
        this.name = name;
        this.otherName = otherName;
        this.homeTown = homeTown;
        this.born = born;
        this.activeSince = activeSince;
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public int getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(int activeSince) {
        this.activeSince = activeSince;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList getGenre() {
        return genres;
    }


    public ArrayList<Single> getSingles() {
        return singles;
    }

    public void setSingles(ArrayList<Single> singles) {
        this.singles = singles;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public String getGenreName() {
        String genreName = "";
        for (int i = 0; i < genres.size(); i++) {
            genreName += genres.get(i).getName() + " ";
        }
        return genreName;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void addSingle(Single single) {
        singles.add(single);
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public String getPic() {
        return pic;
    }

    public ArrayList getGenres() {
        return genres;
    }
}

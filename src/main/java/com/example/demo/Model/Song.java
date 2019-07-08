package com.example.demo.Model;

public class Song {
    private String name;
    private double length;
    private Album album;

    public Song(String name, double length, Album album) {
        this.name = name;
        this.length = length;
        this.album = album;
    }

    public Song(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", Album name='" + album + '\'' +
                '}';
    }


}

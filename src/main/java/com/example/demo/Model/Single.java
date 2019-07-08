package com.example.demo.Model;

public class Single extends Music {
    private String format;
    private double length;
    private String type = "single";

    public Single(String name, int releaseYear, Artist artist, Genre genre, String format, String pic, double length) {
        super(name, releaseYear, artist, genre, pic);
        this.format = format;
        this.length = length;

    }


    public String getFormat() {
        return format;
    }

    public double getLength() {
        return length;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return type;
    }
}

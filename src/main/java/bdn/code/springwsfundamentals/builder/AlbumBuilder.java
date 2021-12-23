package bdn.code.springwsfundamentals.builder;

import bdn.code.springwsfundamentals.model.Album;

public class AlbumBuilder {

    private String name;
    private String artist;
    private int year;

    public AlbumBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AlbumBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public AlbumBuilder setYear(int year) {
        this.year = year;
        return this;
    }


    public Album build() {

        Album album = new Album();

        if (name != null) {
            album.setName(name);
        }
        if (artist != null) {
            album.setArtist(artist);
        }
            album.setYear(year);

        return album;
    }
}

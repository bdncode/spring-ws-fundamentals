package bdn.code.springwsfundamentals.service;

import bdn.code.springwsfundamentals.model.Album;
import bdn.code.springwsfundamentals.builder.AlbumBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MusicService {

    private final Map<String, Album> albumMap = new HashMap<String, Album>() {{
        put("AlbumName", new AlbumBuilder()
                .setArtist("ArtistName")
                .setName("AlbumName")
                .setYear(2021)
                .build());
    }};

    public Album getAlbums(String name) {

        return albumMap.get(name);
    }
}

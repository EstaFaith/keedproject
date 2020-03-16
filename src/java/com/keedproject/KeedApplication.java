package com.keedproject;

import com.keedproject.controller.AlbumController;
import com.keedproject.controller.LibraryController;
import com.keedproject.entity.Song;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class KeedApplication {
    public static void main(String[] args) {
        SpringApplication.run(KeedApplication.class, args);
        LibraryController one = new LibraryController();
        AlbumController two = new AlbumController("disliked", "image_1");
        AlbumController three = new AlbumController("favourite", "image_2");

        Song a = new Song("song1", "fav", "esta", "2.3", true);
        Song b = new Song("song2", "fav", "adele", "3.12", true);
        Song c = new Song("song3", "fav", "artist3", "3.16", true);
        two.addSong(a);
        three.addSong(b);
        three.addSong(c);

        one.addAlbum(two);
        one.addAlbum(three);

        System.out.println(one.getAlbumList());
        System.out.println("songs in album" + two.getSongList());
        System.out.println("songs in album" + three.getSongList());
        System.out.println();
        System.out.println("all songs" + one.getAllSongs());
    }
}

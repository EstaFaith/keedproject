package com.keedproject;

import com.keedproject.controller.AlbumController;
import com.keedproject.controller.LibraryController;
import com.keedproject.entity.Song;

public class KeedApplication {
    public static void main(String[] args) {
        System.out.println("1");

        LibraryController one = new LibraryController();
        AlbumController two = new AlbumController("esta", "image");
        Song k = new Song("song1", "song1Album", "esta", "2.3", true);
        Song l = new Song("song2", "Song2Album", "adele", "3.12", true);
        two.addSong(k);
        two.addSong(l);
        one.addAlbum(two);
        System.out.println(one.getAlbumList());
        System.out.println(two.getSongList());
        System.out.println(one.toString());
    }
}

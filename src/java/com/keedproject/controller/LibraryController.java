package com.keedproject.controller;
import com.keedproject.entity.Library;
import com.keedproject.entity.Song;

import java.util.ArrayList;

/**
 * The first level of the database. Contains an array of albums (all songs are in the album Likes).
 * @author Esta Chioma
 */
public class LibraryController {
    Library lib = new Library();
    private ArrayList<AlbumController> albumList = new ArrayList<AlbumController>();

    public String toString()
    {
        String str = "LIBRARY\n=======";
        for(AlbumController a: this.getAlbumList())
        {
            str += "\n\t" + a.getAlbumTitle();

            for(Song s: a.getSongList())
            {
                str += "\n\t\t"+s.getTitle();
            }
        }
        return str;
    }


    public void addAlbum(AlbumController album)
    {
        albumList.add(album);
    }

    public void removeAlbum(AlbumController album)
    {
        albumList.remove(album);
    }
    /**
     * @return The list of albums
     */
    public ArrayList<AlbumController> getAlbumList()
    {
        return albumList;
    }
    /**
     * Returns all of the songs in the library
     * @return the list of songs
     */
    public ArrayList<Song> getAllSongs()
    {
        ArrayList<Song> songs = new ArrayList<Song>();
        for(AlbumController a: getAlbumList())
        {
            for(Song s:a.getSongList())
            {
                songs.add(s);
            }
        }
        return songs;
    }

    //TODO: add a toString method for easy debugging
}

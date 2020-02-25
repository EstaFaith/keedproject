package com.keedproject.controller;
import java.util.ArrayList;


public class LibraryController {
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

    /**
     * Adds an album to the album list
     * @param album The album that you want to add
     */
    public void addAlbum(AlbumController album)
    {
        albumList.add(album);
    }
    /**
     * Removes an album from the list
     * @param album The album that you want to remove
     */
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

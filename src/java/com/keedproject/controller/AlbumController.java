package com.keedproject.controller;

import com.keedproject.entity.Song;
import com.keedproject.entity.Album;

import java.util.ArrayList;

/**
 * The album is the 2nd level of the database.
 * It has a title,image and then contains songs that you add to it.
 * @author Esta Chioma
 */
public class AlbumController {
    Album album = new Album();
    private ArrayList<Song> songList = new ArrayList<Song>();

    /**
     * Constructs a new Album object
     * @param albumTitle The title of the album
     */
    public AlbumController(String albumTitle, String albumImageUrl)
    {
        albumTitle = album.getAlbumTitle();
        albumImageUrl = album.getAlbumImageUrl();
    }

    /**
     * @return A string that contains the title of all songs
     */
    public String toString()
    {
        return this.getAlbumTitle();
    }

    /**
     * Adds a song to the list of songs in the album
     * @param s The songs to add
     */
    public void addSong(Song s)
    {
        songList.add(s);
        s.setAlbum(this);
    }
    /**
     * Removes the selected song from the album
     * @param s The song to be removed
     */
    public void removeSong(Song s)
    {
        songList.remove(s);
    }

    /**
     * @return The title of the album
     */
    public String getAlbumTitle()
    {
        return album.getAlbumTitle();
    }
    /**
     * @return The list of songs
     */
    public ArrayList<Song> getSongList()
    {
        return songList;
    }

    public static AlbumController findAlbum(ArrayList<AlbumController> albums,String search)
    {
        for(AlbumController a:albums)
        {
            if(a.getAlbumTitle().equalsIgnoreCase(search))
            {
                return a;
            }
        }
        return new AlbumController("","");
    }
}

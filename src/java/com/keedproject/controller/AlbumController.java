package com.keedproject.controller;

import java.util.ArrayList;

public class AlbumController {
    private String albumTitle;
    private ArrayList<Song> songList = new ArrayList<Song>();

    /**
     * Constructs a new Song object
     * @param albumTitle The title of the album
     */
    public AlbumController(String albumTitle)
    {
        this.albumTitle = albumTitle;
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
        return albumTitle;
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
        return new AlbumController("");
    }
}

package com.keedproject.controller;

import com.keedproject.entity.Song;
import com.keedproject.entity.Album;

import java.util.ArrayList;

public class AlbumController {
    Album album = new Album();
    private ArrayList<Song> songList = new ArrayList<Song>();

    /**
     * Constructs a new Album object
     */
    public AlbumController(String albumTitle, String albumImageUrl)
    {
        albumTitle = album.getAlbumTitle();
        albumImageUrl = album.getAlbumImageUrl();
    }

    public String toString()
    {
        return this.getAlbumTitle();
    }

    public void addSong(Song s)
    {
        songList.add(s);
        s.setAlbum(this);
    }

    public void removeSong(Song s)
    {
        songList.remove(s);
    }


    public String getAlbumTitle()
    {
        return album.getAlbumTitle();
    }

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

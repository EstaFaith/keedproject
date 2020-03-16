package com.keedproject.entity;

import com.keedproject.controller.AlbumController;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Song {
    @Id
    @GeneratedValue
    private int songId;

    /*TEMPORARY FILE TO TRY LIBRARY*/
    private String songTitle;
    private String songArtist;
    private String songDuration;
    private boolean songIsLiked = false;

    private String songAlbumStr;
    private AlbumController album;


    public Song(String songTitle, String songAlbumStr, String songArtist, String songDuration, boolean songIsLiked)
    {
        this.songTitle = songTitle;
        this.songAlbumStr = songAlbumStr;
        this.songArtist = songArtist;
        this.songDuration = songDuration;
        this.songIsLiked = songIsLiked;
    }
    public String toString()
    {
        return this.getTitle();
    }

    /**
     * Sets the album.
     */
    public void setAlbum(AlbumController album)
    {
         this.album = album;
    }


    public void delSong()
    {
        this.album.removeSong(this);
    }

    public String getTitle()
    {
        return songTitle;
    }

    public String getArtist()
    {
        return songArtist;
    }

    public String getDuration()
    {
        return songDuration;
    }

    public String getAlbumStr()
    {
        return songAlbumStr;
    }

    public boolean songIsLiked(){return songIsLiked; }

    public AlbumController getAlbum()
    {
        return album;
    }
}

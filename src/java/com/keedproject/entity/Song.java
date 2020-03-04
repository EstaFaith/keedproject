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
     * @param album The album that the song is in
     */
    public void setAlbum(AlbumController album)
    {
         this.album = album;
    }

    /**
     * Removes the song from the album
     */
    public void delSong()
    {
        this.album.removeSong(this);
    }

    /**
     * @return The title of the song
     */
    public String getTitle()
    {
        return songTitle;
    }
    /**
     * @return The name of the artist that made the song
     */
    public String getArtist()
    {
        return songArtist;
    }
    /**
     * @return The duration of the song
     */
    public String getDuration()
    {
        return songDuration;
    }
    /**
     * @return The name of the album.
     */
    public String getAlbumStr()
    {
        return songAlbumStr;
    }
    /**
     * @return the actual album object that the song is a part of
     */
    public boolean songIsLiked(){return songIsLiked; }

    public AlbumController getAlbum()
    {
        return album;
    }
}

package com.keedproject.service;

import com.keedproject.entity.Album;
import com.keedproject.entity.Song;
import com.keedproject.repository.AlbumRepository;
import com.keedproject.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService<list> {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private SongRepository songRepository;

    public void saveAlbum(String albumTitle, String albumImageUrl){
        Song song;

    }





















}

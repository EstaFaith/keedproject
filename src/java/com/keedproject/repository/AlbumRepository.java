package com.keedproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keedproject.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, String>{
    Album findByAlbumId(int albumId);
    Album findByAlbumTitle(String albumTitle);
    Album findByAlbumIdAndAlbumTitle(int albumId, String albumTitle);
}

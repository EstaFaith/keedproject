package com.keedproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.keedproject.entity.Song;
public interface SongRepository extends JpaRepository<Song, String> {
    Song findBySongId(int songId);
    Song findBySongTitle(String songTitle);
    Song findBySongArtist(String songArtist);
    boolean existsBySongTitle(String songTitle);
    Song findBySongTitleAndSongArtist(String songTitle, String songArtist);
}

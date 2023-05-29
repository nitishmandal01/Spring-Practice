package com.masai.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masai.spotify.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

}

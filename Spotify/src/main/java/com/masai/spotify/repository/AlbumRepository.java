package com.masai.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masai.spotify.model.Album;


public interface AlbumRepository extends JpaRepository<Album, Integer>{

}

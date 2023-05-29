package com.masai.spotify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masai.spotify.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Integer>{

}

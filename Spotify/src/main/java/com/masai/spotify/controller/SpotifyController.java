package com.masai.spotify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.*;
import lombok.extern.slf4j.Slf4j;

import com.masai.spotify.model.*;
import com.masai.spotify.service.SpotifyService;
import java.util.*;

@ResponseStatus
@Slf4j
public class SpotifyController {

	@Autowired
	SpotifyService spotifyService;
	
	Logger logger = LoggerFactory.getLogger(SpotifyController.class);
	
	@GetMapping("/users/{userId}/playlists")
	@ResponseStatus(HttpStatus.FOUND)
    public List<Playlist> getUserPlaylistHistory(@PathVariable Integer userId) {
		logger.info("Playlist Found");
        return spotifyService.getUserPlaylistHistory(userId);
        
    }
	
	@PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public void addUser(@RequestBody @Valid User user) {
		spotifyService.addUser(user);
		logger.info("User created");
    }
	
	@PostMapping("/artists")
    @ResponseStatus(HttpStatus.CREATED)
    public void addArtist(@RequestBody @Valid Artist artist) {
		spotifyService.addArtist(artist);
		logger.info("Artist created");
    }
	
	@PostMapping("/songs")
    @ResponseStatus(HttpStatus.CREATED)
    public void addSong(@RequestBody @Valid Song song) {
		spotifyService.addSong(song);
		logger.info("Song created");
    }
	
	@PostMapping("/albums")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAlbum(@RequestBody @Valid Album album) {
		spotifyService.addAlbum(album);
		logger.info("Album created");
    }
	
	@PostMapping("/playlists")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPlaylist(@RequestBody @Valid Playlist playlist) {
		spotifyService.addPlaylist(playlist);
		logger.info("Playlist created");
    }
	
	@PatchMapping("/playlists/{playlistId}/{songId}")
	@ResponseStatus(HttpStatus.OK)
    public void addSongToPlaylist(@PathVariable Integer playlistId , @PathVariable Integer songId) {
		spotifyService.addSongToPlaylist(songId, playlistId);
		logger.info("Song added to Playlist");
    }
	
	@PatchMapping("/playlists/{playlistId}")
	@ResponseStatus(HttpStatus.OK)
    public void updatePlaylist(@PathVariable Integer playlistId) {
        spotifyService.updatePlaylist(playlistId);
        logger.info("Playlist Updated");
    }
	
	
}

package com.masai.spotify.service;

import java.util.List;
import java.util.Optional;

import com.masai.spotify.exception.NotFoundException;
import com.masai.spotify.exception.SpotifyException;
import com.masai.spotify.model.*;
import com.masai.spotify.repository.AlbumRepository;
import com.masai.spotify.repository.ArtistRepository;
import com.masai.spotify.repository.PlaylistRepository;
import com.masai.spotify.repository.SongRepository;
import com.masai.spotify.repository.UserRepository;

public class SpotifyService {
	private ArtistRepository arrepo;
	private UserRepository usrepo;
	private SongRepository sonrepo;
	private AlbumRepository albrepo;
	private PlaylistRepository plarepo;

	public void addArtist(Artist artist) {
		Integer artistId  = artist.getAstistId();
		if(artistId!=null) throw new SpotifyException("artist id shouldn't be there");
		arrepo.save(artist);		
	}
	
	public void addUser(User user) {
		Integer userId  = user.getUserId();
		if(userId!=null) throw new SpotifyException("User id shouldn't be there");
		usrepo.save(user);
	}
	
	public void addSong(Song song) {
		Integer songId = song.getSongId();
		if(songId!=null) throw new SpotifyException("Song id shouldn't be there");
		sonrepo.save(song);
	}

	public void addAlbum(Album album) {
		Integer albumId = album.getAlbumId();
		if(albumId!=null) throw new SpotifyException("Album id shouldn't be there");
		albrepo.save(album);
	}
	
	public void addPlaylist(Playlist playlist) {
		Integer playlistid = playlist.getPlaylistId();
		if(playlistid!=null) throw new SpotifyException("Playlist id shouldn't be there");
		plarepo.save(playlist);
	}
	
	public void createPlaylistByUser(Integer userid, Playlist list) {
		Optional<User> user = usrepo.findById(userid);
		
		if(user.isEmpty()) throw new NotFoundException("User not found");
		
		list.setUser(user.get());
		user.get().getPlaylists().add(list);
	}
	
	public void addSongToPlaylist(Integer songId , Integer playlistId) {
		Optional<Song> song = sonrepo.findById(songId);
		Optional<Playlist> playlist = plarepo.findById(playlistId);
		
		if(song.isEmpty()) throw new NotFoundException("Song Not Found");
		if(playlist.isEmpty()) throw new NotFoundException("Playlist Not Found");
		
		Optional<Playlist> playlistsong = plarepo.findById(songId);
		
		if(playlistsong.isPresent()) throw new SpotifyException("Song already present is the Playlist");
		
		playlist.get().getSonglist().add(song.get());
		song.get().getPlaylist().add(playlist.get());
	
	}
	
	public void updatePlaylist(Integer playlistId ) {
		Optional<Playlist> plist = plarepo.findById(playlistId);
		if(plist.isEmpty()) throw new NotFoundException("Playlist not found");
		
		
		String name = plist.get().getName();
		String desc = plist.get().getDescription();
		Privacy privacy = plist.get().getPrivacy();
		
		
		Playlist playlist = plist.get();
//		plarepo.save(playlist);
		playlist.setName(name);
		playlist.setDescription(desc);
		playlist.setPrivacy(privacy);
	}
	
	public List<Playlist> getUserPlaylistHistory(Integer userid) {
		Optional<User> user = usrepo.findById(userid);
		
		if(user.isEmpty()) throw new NotFoundException("User Not Found");
		
		return user.get().getPlaylists();
		
	}
}

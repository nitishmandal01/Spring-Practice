package com.masai.spotify.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Artist {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer astistId;
	
	@NotNull(message = "name is mendetory")
	private String name;
	
	@NotNull(message = "genre is mendetory")
	private String genre;
	
	@OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
	List<Album> albumlist;
	
	@OneToMany(mappedBy = "artist",cascade = CascadeType.ALL)
	List<Song> songlist;

	public Integer getAstistId() {
		return astistId;
	}

	public void setAstistId(Integer astistId) {
		this.astistId = astistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public List<Album> getAlbumlist() {
		return albumlist;
	}

	public void setAlbumlist(List<Album> albumlist) {
		this.albumlist = albumlist;
	}

	public List<Song> getSonglist() {
		return songlist;
	}

	public void setSonglist(List<Song> songlist) {
		this.songlist = songlist;
	}
	
	
}

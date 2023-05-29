package com.masai.spotify.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Playlist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer playlistId;
	
	@NotNull(message = "value is mendetory")
	private String userId;
	
	@NotNull(message = "value is mendetory")
	private String name;
	
	@NotNull(message = "value is mendetory")
	private String description;
	
	@NotNull(message = "value is mendetory")
	private Privacy privacy;
	
	@ManyToMany(mappedBy = "playlist",cascade = CascadeType.ALL)
	List<Song> songlist;
	
	@ManyToOne
	private User user;

	public Integer getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(Integer playlistId) {
		this.playlistId = playlistId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Privacy getPrivacy() {
		return privacy;
	}

	public void setPrivacy(Privacy privacy) {
		this.privacy = privacy;
	}

	public List<Song> getSonglist() {
		return songlist;
	}

	public void setSonglist(List<Song> songlist) {
		this.songlist = songlist;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}

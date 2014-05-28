package org.uc.mcnealy;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Playlist
 * 
 */
@Entity
public class Playlist implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer PlaylistId;
	private List<String> SongList;
	private static final long serialVersionUID = 1L;

	public Playlist() {
		super();
	}

	public Integer getPlaylistId() {
		return this.PlaylistId;
	}

	public void setPlaylistId(Integer PlaylistId) {
		this.PlaylistId = PlaylistId;
	}

	public List<String> getSongList() {
		return this.SongList;
	}

	public void setSongList(List<String> SongList) {
		this.SongList = SongList;
	}

}

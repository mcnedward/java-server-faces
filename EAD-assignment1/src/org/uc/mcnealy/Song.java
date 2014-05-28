package org.uc.mcnealy;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Song
 * 
 */
@Entity
public class Song implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer songId;
	@ManyToOne
	@JoinColumn(name = "ARTISTID", referencedColumnName = "ARTISTID")
	private Artist artist;
	@ManyToOne
	@JoinColumn(name = "ALBUMID", referencedColumnName = "ALBUMID")
	private Album album;
	private String title;
	private String track;
	private String duration;

	private static final long serialVersionUID = 1L;

	public Song() {
		super();
	}

	/**
	 * @return the songId
	 */
	public Integer getSongId() {
		return songId;
	}

	/**
	 * @param songId
	 *            the songId to set
	 */
	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}

	/**
	 * @param artist
	 *            the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	/**
	 * @return the album
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * @param albumId
	 *            the album to set
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the track
	 */
	public String getTrack() {
		return track;
	}

	/**
	 * @param track
	 *            the track to set
	 */
	public void setTrack(String track) {
		this.track = track;
	}

	/**
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

}

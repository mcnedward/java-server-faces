/**
 * 
 */
package org.uc.mcnealy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author emcnealy
 * 
 */
public class MusicDatabase {

	private static EntityManager em;

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EAD-assignment1");
		em = factory.createEntityManager();

		// Artist artist = new Artist("Silverstein");
		// Genre genre = new Genre("Post-Hardcore");
		// Album album = new Album("Discovering the Waterfront", artist, genre, "2005");

		// insert(artist, genre, album);
		Album album = em.find(Album.class, 1);
		System.out.println("The artist for the album " + album.getAlbum() + " is "
				+ album.getArtist() + ".");
	}

	private static void insert(Artist artist, Genre genre, Album album) {
		em.getTransaction().begin();

		em.persist(artist);
		em.persist(genre);
		em.persist(album);

		em.getTransaction().commit();

		System.out.println(String.format("The artist %s, genre %s, and album %s have been added!",
				artist.getArtist(), genre.getGenre(), album.getAlbum()));
	}
}

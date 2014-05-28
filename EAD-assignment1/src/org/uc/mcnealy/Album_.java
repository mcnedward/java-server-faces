package org.uc.mcnealy;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-05-28T16:29:42.560-0400")
@StaticMetamodel(Album.class)
public class Album_ {
	public static volatile SingularAttribute<Album, Integer> albumId;
	public static volatile SingularAttribute<Album, String> album;
	public static volatile SingularAttribute<Album, Artist> artist;
	public static volatile SingularAttribute<Album, Genre> genre;
	public static volatile SingularAttribute<Album, String> releaseYear;
	public static volatile ListAttribute<Album, Song> songList;
}

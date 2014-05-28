package org.uc.mcnealy;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2014-05-28T16:18:39.901-0400")
@StaticMetamodel(Song.class)
public class Song_ {
	public static volatile SingularAttribute<Song, Integer> songId;
	public static volatile SingularAttribute<Song, Artist> artist;
	public static volatile SingularAttribute<Song, Album> album;
	public static volatile SingularAttribute<Song, String> title;
	public static volatile SingularAttribute<Song, String> track;
	public static volatile SingularAttribute<Song, String> duration;
}

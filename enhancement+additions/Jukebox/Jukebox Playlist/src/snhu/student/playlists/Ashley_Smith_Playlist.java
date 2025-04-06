package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class Ashley_Smith_Playlist {

	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		
		  JonasBrothers JonasBrothers = new JonasBrothers();
		ArrayList<Song> JonasBrothersTracks = new ArrayList<Song>();
		JonasBrothersTracks = JonasBrothers.getJonasBrothersSongs();
	  

		PostMalone postMalone = new     PostMalone(); // postMalone is a new instance of the class PostMalone. postMalone has access to PostMalone variables and methods.
		 ArrayList<Song> postMaloneTracks = new ArrayList<Song>();  // This postMaloneTracks is a new instance of class song. postMaloneTracks is an array of instances of the class song. Class song has two attributes
		 // The first attribute is t for title. The second attribute is a  for artist
		 
		 
		 // This will call an instance of the getHansZimmerSongs() function and store it in the postMaloneTracks array
		 postMaloneTracks =  postMalone.getPostMaloneSongs();
		
		 
		 
		 TaylorSwift taylorSwift  =  new     TaylorSwift();
		 ArrayList<Song>  taylorSwiftTracks   = new ArrayList<Song>();
		 taylorSwiftTracks =         taylorSwift.getTaylorSwiftSongs();
		 
		 
		 PanicAtTheDisco panicAtTheDisco  = new     PanicAtTheDisco();
		 ArrayList<Song>       panicAtTheDiscoTracks = new ArrayList<Song>();
		 panicAtTheDiscoTracks =  panicAtTheDisco.getPanicAtTheDiscoSongs();
		 
		 
		 playlist.add(JonasBrothersTracks.get(0));

		 playlist.add(postMaloneTracks.get(0));
		 playlist.add(postMaloneTracks.get(1));
		 playlist.add(postMaloneTracks.get(2)); // Third postMaloneTracks is set to 2 because arrays start from 0.
		 
		 playlist.add(taylorSwiftTracks.get(0));
		 
		 playlist.add(panicAtTheDiscoTracks.get(0));
		
	    return playlist;
		}
	}
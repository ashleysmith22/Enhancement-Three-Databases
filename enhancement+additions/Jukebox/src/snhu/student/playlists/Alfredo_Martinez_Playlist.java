package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;


public class Alfredo_Martinez_Playlist {

	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		
		  ElvisPresley elvisPresley = new ElvisPresley();
		ArrayList<Song> elvisPresleyTracks = new ArrayList<Song>();
		elvisPresleyTracks = elvisPresley.getElvisPresleySongs();
	  

		HansZimmer hansZimmer = new     HansZimmer(); // hansZimmer is a new instance of the class HansZimmer. hanZimmer has access to HansZimmer variables and methods.
		 ArrayList<Song> hansZimmerTracks = new ArrayList<Song>();  // This hansZimmerTracks is a new instance of class song. hansZimmerTracks is an array of instances of the class song. Class song has two attributes
		 // The first attribute is t for title. The second attribute is a  for artist
		 
		 
		 // This will call an instance of the getHansZimmerSongs() funtion and store it in the hansZimmerTracks array
		 hansZimmerTracks =  hansZimmer.getHansZimmerSongs();
		
		 
		 
		 EnriqueIglesias enriqueIglesias  =  new     EnriqueIglesias();
		 ArrayList<Song>  enriqueIglesiasTracks   = new ArrayList<Song>();
		 enriqueIglesiasTracks =         enriqueIglesias.getEnriqueIglesiasSongs();
		 
		 
		 BillWithers billWithers  = new     BillWithers();
		 ArrayList<Song>       billWithersTracks = new ArrayList<Song>();
		 billWithersTracks =  billWithers.getBillWithersSongs();
		 
		 
		 playlist.add(elvisPresleyTracks.get(0));

		 playlist.add(hansZimmerTracks.get(0));
		 playlist.add(hansZimmerTracks.get(1));
		 playlist.add(hansZimmerTracks.get(2)); // Third hansZimmerTracks is set to 2 because arrays start from 0.
		 
		 playlist.add(enriqueIglesiasTracks.get(0));
		 
		 playlist.add(billWithersTracks.get(0));
		
	    return playlist;
		}
	}
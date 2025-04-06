package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class DennisPersaud_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();			// Linked list for play list
	ArrayList<Song> princeTracks = new ArrayList<Song>();						// Array of prince songs
	Prince prince =  new Prince();
	
	princeTracks = prince.getPrinceSongs();										// Call getPrinceSongs
	playlist.add(princeTracks.get(0));											// Add Prince songs
	playlist.add(princeTracks.get(1));
	
	
	ArrayList<Song> jColeTracks = new ArrayList<Song>();						// Array of J Cole songs
	JCole jColeBand = new JCole();
	
	jColeTracks = jColeBand.getJColeSongs(); 									// Call getJColeSongs
	playlist.add(jColeTracks.get(0));											// Add J Cole songs
	playlist.add(jColeTracks.get(1));
	playlist.add(jColeTracks.get(2));
	

	ArrayList<Song> tupacTracks = new ArrayList<Song>();						// Array of tupac songs
	Tupac tupacBand = new Tupac();
	
	tupacTracks = tupacBand.getTupacSongs();									// Call getTupacSongs
	playlist.add(tupacTracks.get(0));											// Add Tupac songs
	
    
	return playlist;
	}
}

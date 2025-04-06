package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class DjangoReinhardt {
	
	//  Initialize variables for albumTrack (a list) and album title	
	ArrayList<Song> albumTracks;
	String albumTitle;
	
	public DjangoReinhardt() {
	}

	//  Method to create a instance of a list to get songs for Django Reinhardt
	public ArrayList<Song> getDjangoReinhardtSongs() {
		
		albumTracks = new ArrayList<Song>();						    //  Instantiate the album to populate it below
		Song track1 = new Song("Minor Swing", "Django Reinhardt");	    //  Create a song
		Song track2 = new Song("Daphne", "Django Reinhardt");			//  Create another song
		Song track3 = new Song("Belleville", "Django Reinhardt");		//  Create another song
		Song track4 = new Song("Djangology", "Django Reinhardt");	    //  Create another song
		
		this.albumTracks.add(track1);								//  Add song to Django Reinhardt song list.
		this.albumTracks.add(track2);								
		this.albumTracks.add(track3);								
		this.albumTracks.add(track4);										
		return albumTracks;											//Return the songs for the Django Reinhardt in the form of an ArrayList
	}
}

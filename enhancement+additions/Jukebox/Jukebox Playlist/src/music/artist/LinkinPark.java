package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//  Create a new artist Linkin Park
public class LinkinPark {
	
	//  Initialize variables for albumTrack (a list) and album title
	ArrayList<Song> albumTracks;
	String albumTitle;
	
	public LinkinPark() {		
	}
	
	//  Method to create a instance of a list to get songs for Linkin Park
	public ArrayList<Song> getLinkinParkSongs() {
		
		albumTracks = new ArrayList<Song>();					//  Instantiate the album to populate it below
		Song track1 = new Song("Numb", "Linkin Park");			//  Create a song
		Song track2 = new Song("New Divide", "Linkin Park");	//  Create another song
		Song track3 = new Song("In the End", "Linkin Park");	//  Create another song
		
		this.albumTracks.add(track1);							//  Add song to Linkin Park song list.
		this.albumTracks.add(track2);							//  Add song to Linkin Park song list.
		this.albumTracks.add(track3);							//  Add song to Linkin Park song list.
		return albumTracks;										//Return the songs for the Linkin Park in the form of an ArrayList
	}
}

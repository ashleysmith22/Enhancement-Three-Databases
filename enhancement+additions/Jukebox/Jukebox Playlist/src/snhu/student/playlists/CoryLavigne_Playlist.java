package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;
 
public class CoryLavigne_Playlist {
    
	//call StudentPlaylist() to create a list of songs
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	//create an array to store the songs in and pull all songs from the SimonGarfunkel artist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> simonGarfunkelTracks = new ArrayList<Song>();
    SimonGarfunkel SimonGarfunkel = new SimonGarfunkel();
    
	//Pull in the simonGarfunkelTracks
    simonGarfunkelTracks = SimonGarfunkel.getSimonGarfunkelSongs();
	
	playlist.add(simonGarfunkelTracks.get(0));
	playlist.add(simonGarfunkelTracks.get(1));
	playlist.add(simonGarfunkelTracks.get(2));
	
	CharlesBradley charlesBradleyBand = new CharlesBradley();
	ArrayList<Song> charlesBradleyTracks = new ArrayList<Song>();
	charlesBradleyTracks = charlesBradleyBand.getCharlesBradleySongs();
	
	playlist.add(charlesBradleyTracks.get(0));
	playlist.add(charlesBradleyTracks.get(1));
	
    return playlist;
	}
}

package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class MerlinNikodemus_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> rammsteinTracks = new ArrayList<Song>();
    Rammstein rammsteinBand = new Rammstein();
    rammsteinTracks = rammsteinBand.getRammsteinSongs();
	
	playlist.add(rammsteinTracks.get(0)); //add "Amerika"
	playlist.add(rammsteinTracks.get(1)); //add "Fruehling in Paris"
	playlist.add(rammsteinTracks.get(2)); //add "Rosenrot"
	
	ArrayList<Song> dollyPartonTracks = new ArrayList<Song>();
    DollyParton dollyPartonBand = new DollyParton();
    dollyPartonTracks = dollyPartonBand.getDollyPartonSongs();
	
	playlist.add(dollyPartonTracks.get(0)); //add "Two Doors Down"
	playlist.add(dollyPartonTracks.get(1)); // add "Jolene"
	
    return playlist;
	}
}

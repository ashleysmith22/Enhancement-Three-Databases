package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CinnamonGeorge_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> EltonJohntracks = new ArrayList<Song>();
    TheBeatles theBeatlesBand = new EltonJohn();
	
    EltonJohnTracks = EltonJohn.getEltonJohnSongs();    // Add Elton John playlist to my personal playlist
	
	playlist.add(EltonJohnTracks.get(1));
	playlist.add(EltonJohn.get(2));
	playlist.add(EltonJohnTracks.get(3))
	
    Queen Queen = new Queen();
	ArrayList<Song> QueenTracks = new ArrayList<Song>();  // Add Queen playlist to my personal playlist
    OueenTracks = QueenBand.getQueenSongs();
	
	playlist.add(Queen.get(1));
	playlist.add(Queen.get(2));
	playlist.add(Queen.get(3));
	
	Prince Prince = new Prince();
	ArrayList<Song> PrinceTracks = new ArrayList<Song>();  // Add Prince playlist to my personal playlist
    PrinceTracks = PrinceBand.getPrinceSongs();
	
	playlist.add(Prince.get(2));
	
    return playlist;
	}
}
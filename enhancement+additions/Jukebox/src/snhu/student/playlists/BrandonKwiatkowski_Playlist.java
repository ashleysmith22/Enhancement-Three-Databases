package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BrandonKwiatkowski_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> MacMillerTracks = new ArrayList<Song>();
    MacMiller macMiller = new MacMiller();
	
    MacMillerTracks = macMiller.getMacMillerSongs();
	
	playlist.add(MacMillerTracks.get(0));
	playlist.add(MacMillerTracks.get(1));
	playlist.add(MacMillerTracks.get(2));
	playlist.add(MacMillerTracks.get(3));
	
	
    MtJoy mtJoy = new MtJoy();
	ArrayList<Song> MtJoyTracks = new ArrayList<Song>();
    MtJoyTracks = mtJoy.getMtJoySongs();
	
	playlist.add(MtJoyTracks.get(0));
	playlist.add(MtJoyTracks.get(1));
	
	//
	//Adding new songs in my playlist from my teammates playlist 
    VampireWeekend vampireWeekend = new VampireWeekend();
	ArrayList<Song> vampireWeekendTracks = new ArrayList<Song>();
    vampireWeekendTracks = vampireWeekend.getVampireWeekendSongs();
	
	playlist.add(vampireWeekendTracks.get(0));
	playlist.add(vampireWeekendTracks.get(1));
	playlist.add(vampireWeekendTracks.get(2));
	
    return playlist;
	}
}

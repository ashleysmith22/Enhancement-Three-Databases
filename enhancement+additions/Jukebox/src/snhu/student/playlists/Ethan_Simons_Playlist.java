package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

// Playlist class for Ethan Simons
public class Ethan_Simons_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> IronMaidenTracks = new ArrayList<Song>();
    IronMaiden theIronMaiden = new IronMaiden();
	
    ironMaidenTracks = ironMaidenBand.getIronMaidenSongs();
	
	playlist.add(ironMaidenTracks.get(0));
	playlist.add(ironMaidenTracks.get(1));
	playlist.add(ironMaidenTracks.get(2));
	playlist.add(ironMaidenTracks.get(3));
	playlist.add(ironMaidenTracks.get(4));
	
	
    BeastieBoys beastieBoysBand = new BeastieBoys();
	ArrayList<Song> beastieBoysTracks = new ArrayList<Song>();
	beastieBoysTracks = beastieBoysBand.getBeastieBoysSongs();
	
	playlist.add(beastieBoysTracks.get(0));
	playlist.add(beastieBoysTracks.get(1));
	playlist.add(beastieBoysTracks.get(2));
	playlist.add(beastieBoysTracks.get(3));
	playlist.add(beastieBoysTracks.get(4));
	
    return playlist;
	}
}

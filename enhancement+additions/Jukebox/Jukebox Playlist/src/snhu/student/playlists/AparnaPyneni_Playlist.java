package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AparnaPyneni_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> princeTracks = new ArrayList<Song>();
    Prince princeBand = new Prince();
	
    princeTracks = princeBand.getPrinceSongs();
	
	playlist.add(princeTracks.get(0));
	playlist.add(princeTracks.get(1));
	playlist.add(princeTracks.get(2));
	
	
    Seether seetherBand = new Seether();
	ArrayList<Song> seetherTracks = new ArrayList<Song>();
    seetherTracks = seetherBand.getSeetherSongs();
	
	playlist.add(seetherTracks.get(0));
	playlist.add(seetherTracks.get(1));
	
	
    return playlist;
	}
}

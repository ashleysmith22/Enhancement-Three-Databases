package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;
//Created new class for Kayla Lessard Playlist 
public class KaylaLessard_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
		//Alexisonfire playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> alexisonfireTracks = new ArrayList<Song>();
    Alexisonfire alexisonfireBand = new Alexisonfire();
	
    alexisonfireTracks = alexisonfireBand.getAlexisonfireSongs();
	
	playlist.add(alexisonfireTracks.get(0));
	playlist.add(alexisonfireTracks.get(1));
	playlist.add(alexisonfireTracks.get(2));	
	playlist.add(alexisonfireTracks.get(3));
	playlist.add(alexisonfireTracks.get(4));
	playlist.add(alexisonfireTracks.get(5));	
	
	//Erra Playlist
    Erra erraBand = new Erra();
	ArrayList<Song> erraTracks = new ArrayList<Song>();
    erraTracks = erraBand.getErraSongs();
	
	playlist.add(erraTracks.get(0));
	playlist.add(erraTracks.get(1));
	playlist.add(erraTracks.get(2));
	playlist.add(erraTracks.get(3));
	playlist.add(erraTracks.get(4));
	playlist.add(erraTracks.get(5));

	
    return playlist;
	}
}

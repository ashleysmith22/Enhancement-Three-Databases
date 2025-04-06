package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class MParsons_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> TBPTracks = new ArrayList<Song>();
    TheBandPerry theBandPerry = new TheBandPerry();
	
    TBPTracks = theBandPerry.getTBPSongs();
	
	playlist.add(TBPTracks.get(0));
	playlist.add(TBPTracks.get(1));
	
	
    Offspring theOffspring = new Offspring();
	ArrayList<Song> offspringTracks = new ArrayList<Song>();
    offspringTracks = theOffspring.getOffspringSongs();
	
	playlist.add(offspringTracks.get(0));
	playlist.add(offspringTracks.get(1));
	playlist.add(offspringTracks.get(2));
	
    return playlist;
	}
}

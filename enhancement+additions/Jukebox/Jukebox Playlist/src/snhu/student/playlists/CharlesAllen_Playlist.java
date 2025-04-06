package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class CharlesAllen_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> seetherTracks = new ArrayList<Song>();
	Seether seetherBand = new Seether();
    
	seetherTracks = seetherBand.getSeetherSongs();
	
	playlist.add(seetherTracks.get(0));
	playlist.add(seetherTracks.get(1));
	

	FrogLeapStudios frogLeapBand = new FrogLeapStudios();
	ArrayList<Song> frogLeapStudiosTracks = new ArrayList<Song>();
    frogLeapStudiosTracks = frogLeapBand.getFrogLeapStudiosSongs();
	
	playlist.add(frogLeapStudiosTracks.get(0));
	playlist.add(frogLeapStudiosTracks.get(1));
	playlist.add(frogLeapStudiosTracks.get(2));
	
    return playlist;
	}
}

package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class LoganBurkham_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	// Creates Logan Burkham Play List
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> beatlesTracks = new ArrayList<Song>();
    TheBeatles theBeatlesBand = new TheBeatles();
	
    beatlesTracks = theBeatlesBand.getBeatlesSongs();
	
	playlist.add(beatlesTracks.get(0));
	playlist.add(beatlesTracks.get(1));
	
	
    CharlesBradley charlesBradleyBand = new CharlesBradley();
	ArrayList<Song> charlesBradleyTracks = new ArrayList<Song>();
    charlesBradleyTracks = charlesBradleyBand.getCharlesBradleySongs();
	
	playlist.add(charlesBradleyTracks.get(0));
	playlist.add(charlesBradleyTracks.get(1));
	playlist.add(charlesBradleyTracks.get(2));
	
    Superorganism superorganismBand = new Superorganism();
	ArrayList<Song> superorganismTracks = new ArrayList<Song>();
	superorganismTracks = superorganismBand.getSuperorganismSongs();
	
	playlist.add(superorganismTracks.get(0));
	playlist.add(superorganismTracks.get(1));
	
    BillWithers billWithersBand = new BillWithers();
	ArrayList<Song> billWithersTracks = new ArrayList<Song>();
	billWithersTracks = billWithersBand.getBillWithersSongs();
	
	playlist.add(billWithersTracks.get(0));
	
    return playlist;
	}
}

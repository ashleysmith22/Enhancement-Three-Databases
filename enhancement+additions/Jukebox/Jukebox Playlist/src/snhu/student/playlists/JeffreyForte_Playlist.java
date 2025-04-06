//Created by Jeffrey Forte 
//SNHU CS-310-J6597 Collaboration and Team Projects
//August 2nd, 2020
package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;
import music.artist.PinkFloyd;
import music.artist.VampireWeekend;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class JeffreyForte_Playlist {
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		ArrayList<Song> pinkFloydTracks = new ArrayList<Song>();
	    PinkFloyd pinkFloyd = new PinkFloyd();
		
	    pinkFloydTracks = pinkFloyd.getPinkFloydSongs();
		
		playlist.add(pinkFloydTracks.get(0));
		playlist.add(pinkFloydTracks.get(1));
		playlist.add(pinkFloydTracks.get(2));
		
		
	    VampireWeekend vampireWeekend = new VampireWeekend();
		ArrayList<Song> vampireWeekendTracks = new ArrayList<Song>();
	    vampireWeekendTracks = vampireWeekend.getVampireWeekendSongs();
		
		playlist.add(vampireWeekendTracks.get(0));
		playlist.add(vampireWeekendTracks.get(1));
		playlist.add(vampireWeekendTracks.get(2));
		
	    return playlist;
		}

}

package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Joshua_Jimenez_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
			// create Joshua Jimenez Play list 
		
			LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
			ArrayList<Song> anuelAATracks = new ArrayList<Song>();
		    AnuelAA anuelAA = new AnuelAA();
			
		    anuelAATracks = anuelAA.getAnuelAASongs();
			
			playlist.add(anuelAATracks.get(0));
			playlist.add(anuelAATracks.get(1));
			playlist.add(anuelAATracks.get(2));
			
			
		    BadBunny badBunny = new BadBunny();
			ArrayList<Song> badBunnyTracks = new ArrayList<Song>();
			badBunnyTracks = badBunny.getBadBunnySongs();
			
			playlist.add(badBunnyTracks.get(0));
			playlist.add(badBunnyTracks.get(1));
			playlist.add(badBunnyTracks.get(2));
			
		    return playlist;
			}

	}


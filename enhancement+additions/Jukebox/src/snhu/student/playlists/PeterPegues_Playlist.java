package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.*;


import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class PeterPegues_Playlist {
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		//  Create an instance of PlayableSongs named playlist
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		
		//  Create an Array list of all 
		ArrayList<Song> djangoReinhardt = new ArrayList<Song>();
		DjangoReinhardt djangoReinhardtBand = new DjangoReinhardt();	
	    djangoReinhardt = djangoReinhardtBand.getDjangoReinhardtSongs();
	    
	    ArrayList<Song> ween = new ArrayList<Song>();
	    Ween weenBand = new Ween();
	    ween = weenBand.getWeenSongs();
	    
		//  Create an Array list of all Bon Jovi songs from BonJovi class.
	    // From Igor Mozheyko
		ArrayList<Song> bonJoviTracks = new ArrayList<Song>();
	    BonJovi bonJoviBand = new BonJovi();	
	    bonJoviTracks = bonJoviBand.getBonJoviSongs();
	    
		//  Add selected songs from each list to playlist.
	    playlist.add(djangoReinhardt.get(0));
		playlist.add(djangoReinhardt.get(1));
		playlist.add(djangoReinhardt.get(2));
		playlist.add(djangoReinhardt.get(3));
		
		playlist.add(ween.get(0));
		playlist.add(ween.get(1));
		playlist.add(ween.get(2));
		playlist.add(ween.get(3));
		
		playlist.add(bonJoviTracks.get(0));
		playlist.add(bonJoviTracks.get(1));
		playlist.add(bonJoviTracks.get(2));
		
	    return playlist;
		}
}

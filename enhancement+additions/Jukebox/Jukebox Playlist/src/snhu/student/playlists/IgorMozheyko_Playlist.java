package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class IgorMozheyko_Playlist {
	
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	//  Create an instance of PlayableSongs named playlist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	//  Create an Array list of all Bon Jovi songs from BonJovi class.
	ArrayList<Song> bonJoviTracks = new ArrayList<Song>();
    BonJovi bonJoviBand = new BonJovi();	
    bonJoviTracks = bonJoviBand.getBonJoviSongs();	
	
    //  Create an Array list of all Linkin Park songs from LinkinPark class.
    LinkinPark linkinParkBand = new LinkinPark();
	ArrayList<Song> linkinParkTracks = new ArrayList<Song>();
    linkinParkTracks = linkinParkBand.getLinkinParkSongs();
    
    //  Create an Array list of all Adele songs from Adele class.
    Adele adeleSinger = new Adele();
    ArrayList<Song> adeleTracks = new ArrayList<Song>();
    adeleTracks = adeleSinger.getAdelesSongs();
    
	//  Add selected songs from each list to playlist.
    playlist.add(bonJoviTracks.get(0));
	playlist.add(adeleTracks.get(0));
	playlist.add(linkinParkTracks.get(1));
	playlist.add(bonJoviTracks.get(2));
	playlist.add(adeleTracks.get(2));
	playlist.add(linkinParkTracks.get(0));
	playlist.add(bonJoviTracks.get(1));
	playlist.add(linkinParkTracks.get(2));
	playlist.add(bonJoviTracks.get(3));
	
    return playlist;
	}
}
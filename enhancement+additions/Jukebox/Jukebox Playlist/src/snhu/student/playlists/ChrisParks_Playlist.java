package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;
 
public class ChrisParks_Playlist {
    
	//Call StudentPlaylist() to create a list of songs
	public LinkedList<PlayableSong> StudentPlaylist(){
		
	//Organization to pull songs added myself 
	//Create an array to store the songs in and pull all songs from the OneRepublic artist
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> OneRepublicTracks = new ArrayList<Song>();
    OneRepublic OneRepublic = new OneRepublic();
    
	//Pull in the OneRepublic Tracks
    OneRepublicTracks = OneRepublic.getOneRepublicSongs();
	
	playlist.add(OneRepublicTracks.get(0));
	playlist.add(OneRepublicTracks.get(1));
	playlist.add(OneRepublicTracks.get(2));
	
	//Create an array to store the songs in and pull all songs from the Coldplay artist
	Coldplay Coldplay = new Coldplay();
	ArrayList<Song> ColdplayTracks = new ArrayList<Song>();
	ColdplayTracks = Coldplay.getColdplaySongs();
	
	//Pull in the Coldplay Tracks
	playlist.add(ColdplayTracks.get(0));
	playlist.add(ColdplayTracks.get(1));
	playlist.add(ColdplayTracks.get(2));
	
	//Organization to add songs added by others
	//Create an array to store the songs in and pull all songs from the Imagine Dragons artist
	ImagineDragons ImagineDragons = new ImagineDragons();
	ArrayList<Song> ImagineDragonsTracks = new ArrayList<Song>();
	ImagineDragonsTracks = ImagineDragons.getImagineDragonsSongs();
	
	//Pull in Radioactive from the track list
	playlist.add(ImagineDragonsTracks.get(1));
	
	//Create an array to store the songs in and pull all songs from the Queen artist
	Queen Queen = new Queen();
	ArrayList<Song> QueenTracks = new ArrayList<Song>();
	QueenTracks = Queen.getQueenSongs();
	
	//Pull in Bohemian Rhapsody from the track list
	playlist.add(QueenTracks.get(0));
	
	//Create an array to store the songs in and pull all songs from the Linkin Park artist
	LinkinPark LinkinPark = new LinkinPark();
	ArrayList<Song> LinkinParkTracks = new ArrayList<Song>();
	LinkinParkTracks = LinkinPark.getLinkinParkSongs();
	
	//Pull in In The End from the track list
	playlist.add(LinkinParkTracks.get(2));
	
    return playlist;
	}
}

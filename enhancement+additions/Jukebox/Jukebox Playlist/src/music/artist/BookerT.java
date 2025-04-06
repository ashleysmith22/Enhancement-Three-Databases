package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class BookerT {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BookerT() {
    }
    
    public ArrayList<Song> getBookerTSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Green Onions", "Booker T. & the M.G.'s");	//Create a song
         this.albumTracks.add(track1);                         	//Add the first song to song list
         return albumTracks;                                    //Return the songs in the form of an ArrayList
    }
}
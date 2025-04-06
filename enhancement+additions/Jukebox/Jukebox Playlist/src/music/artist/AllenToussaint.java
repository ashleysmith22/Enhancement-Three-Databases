package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class AllenToussaint {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public AllenToussaint() {
    }
    
    public ArrayList<Song> getAllenToussaintSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                      		//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Southern Nights", "Allen Toussaint");	//Create a song
         this.albumTracks.add(track1);                                 	//Add the first song to song list
         return albumTracks;                                            //Return the songs in the form of an ArrayList
    }
}
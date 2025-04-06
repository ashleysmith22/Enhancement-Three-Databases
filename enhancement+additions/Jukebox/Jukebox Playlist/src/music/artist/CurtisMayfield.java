package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class CurtisMayfield {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public CurtisMayfield() {
    }
    
    public ArrayList<Song> getCurtisMayfieldSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                     	//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Tripping Out", "Curtis Mayfield");	//Create a song
         this.albumTracks.add(track1);                              //Add the first song to song list
         return albumTracks;                                        //Return the songs in the form of an ArrayList
    }
}
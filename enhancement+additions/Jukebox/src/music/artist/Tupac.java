package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Tupac {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Tupac() {
    }
    
    public ArrayList<Song> getTupacSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Changes", "Tupac");            				//Create a song
         Song track2 = new Song("Dear Mama", "Tupac");         					//Create another song
         Song track3 = new Song("I Get Around", "Tupac");						//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Tupac
         this.albumTracks.add(track2);                                          //Add the second song to song list for Tupac 
         this.albumTracks.add(track3);											//Add the third song to song list Tupac
         return albumTracks;                                                    //Return the songs for Tupac in the form of an ArrayList
    }
}

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FelaKuti {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FelaKuti() {
    }
    
    public ArrayList<Song> getFelaKutiSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Let's Start", "Fela Kuti");	//Create a song
         this.albumTracks.add(track1);                          //Add the first song to song list
         return albumTracks;                                    //Return the songs in the form of an ArrayList
    }
}
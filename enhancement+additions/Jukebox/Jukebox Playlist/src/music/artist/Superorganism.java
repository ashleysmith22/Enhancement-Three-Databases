package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Superorganism {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Superorganism() {
    }
    
    public ArrayList<Song> getSuperorganismSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   				//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Everybody Wants To Be Famous", "Superorganism");         		//Create a song
         Song track2 = new Song("Something For Your M.I.N.D.", "Superorganism");         		//Create another song
         this.albumTracks.add(track1);                                          				//Add the first song to song list for the Superorganism
         this.albumTracks.add(track2);                                          				//Add the second song to song list for the Superorganism
         return albumTracks;                                                    				//Return the songs for the Superorganism in the form of an ArrayList
    }
}

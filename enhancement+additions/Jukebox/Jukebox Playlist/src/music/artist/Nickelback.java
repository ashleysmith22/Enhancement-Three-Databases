package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Nickelback {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Nickelback() {
    }
    
    public ArrayList<Song> getNickelbackSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("How You Remind Me", "Nickelback");             //Create a song
         Song track2 = new Song("Rockstar", "Nickelback");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Nickelback
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Nickelback
         return albumTracks;                                                    //Return the songs for the Nickelback in the form of an ArrayList
    }
}

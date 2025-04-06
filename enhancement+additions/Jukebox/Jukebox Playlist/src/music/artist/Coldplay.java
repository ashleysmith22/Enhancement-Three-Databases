package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Coldplay {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Coldplay() {
    }
    
    public ArrayList<Song> getColdplaySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Clocks", "Coldplay");             				//Create a song
         Song track2 = new Song("Fix You", "Coldplay");        					//Create another song
         Song track3 = new Song("Yellow", "Coldplay");                  		//Add Yellow
         this.albumTracks.add(track1);                                          //Add the first song to song list for Coldplay
         this.albumTracks.add(track2);                                          //Add the second song to song list for Coldplay
         this.albumTracks.add(track3);                                          //Add Yellow to the song list
         return albumTracks;                                                    //Return the songs for Coldplay in the form of an ArrayList
    }
}

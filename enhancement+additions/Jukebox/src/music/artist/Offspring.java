package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Offspring {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Offspring() {
    }
    
    public ArrayList<Song> getOffspringSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("You're Gonna Go Far, Kid", "The Offspring");             //Create a song
         Song track2 = new Song("Why Don't You Get a Job", "The OffSpring");         //Create another song
         Song track3 = new Song("The Kids Aren't Alright", "The OffSpring");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Beatles 
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}

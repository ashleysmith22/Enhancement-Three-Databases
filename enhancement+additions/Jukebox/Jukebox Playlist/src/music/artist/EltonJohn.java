package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class EltonJohn {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public EltonJohn() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Rocket Man", "Elton JOhn");                    //Create a song
         Song track2 = new Song("Your Song", "Elton John");                     //Create another song
         Song track3 = new Song("Crocodile Rock", "Elton John");                //Create another son
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Elton John
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Elton John
         this.albumTracks.add(track3);                                          //Add the third song to song list for hthe Elton John
         return albumTracks;                                                    //Return the songs for the Elton John in the form of an ArrayList
    }
}
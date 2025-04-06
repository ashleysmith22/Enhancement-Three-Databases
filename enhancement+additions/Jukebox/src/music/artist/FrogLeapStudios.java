package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FrogLeapStudios {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FrogLeapStudios() {
    }
    
    public ArrayList<Song> getFrogLeapStudiosSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Man of Constant Sorrow", "Frog Leap Studios");             //Create a song
         Song track2 = new Song("The Devil Went Down To Georgia", "Frog Leap Studios");         //Create another song
         Song track3 = new Song("GhostBusters", "Frog Leap Studios");
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class JCole {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public JCole() {
    }
    
    public ArrayList<Song> getJColeSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("MIDDLE CHILD", "J. Cole");            		 	//Create a song
         Song track2 = new Song("No Role Models", "J. Cole");         			//Create another song
         Song track3 = new Song("The Climb Back","J. Cole");					//Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for JCole
         this.albumTracks.add(track2);                                          //Add the second song to song list for JCole 
         this.albumTracks.add(track3);											//Add the third song to the song list for JCole
         return albumTracks;                                                    //Return the songs for JCole in the form of an ArrayList
    }
}

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class OneRepublic {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public OneRepublic() {
    }
    
    public ArrayList<Song> getOneRepublicSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Good Life", "OneRepublic");             		//Create a song
         Song track2 = new Song("Wanted", "OneRepublic");        				//Create another song
         Song track3 = new Song("Connection", "OneRepublic");                   //Add Connection
         this.albumTracks.add(track1);                                          //Add the first song to song list for OneRepublic
         this.albumTracks.add(track2);                                          //Add the second song to song list for OneRepublic
         this.albumTracks.add(track3);                                          //Add Connection to the song list
         return albumTracks;                                                    //Return the songs for OneRepublic in the form of an ArrayList
    }
}

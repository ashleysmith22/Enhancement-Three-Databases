package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ElvisPresley {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ElvisPresley() {
    }
    
    public ArrayList<Song> getElvisPresleySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("There's Alway Me", "Elvis Presley");             //Create a song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatle                             //Add the second song to song list for the Beatles 
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }
}

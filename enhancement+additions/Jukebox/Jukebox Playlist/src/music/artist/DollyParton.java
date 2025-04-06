package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class DollyParton {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public DollyParton() {
    }
    
    public ArrayList<Song> getDollyPartonSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                  //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Two Doors Down", "Dolly Parton");             //Create a song
         Song track2 = new Song("Jolene", "Dolly Parton");                     //Create another song
         this.albumTracks.add(track1);                                         //Add the first song to song list for Dolly Parton
         this.albumTracks.add(track2);                                         //Add the second song to song list for Dolly Parton 
         return albumTracks;                                                   //Return the songs for Dolly Parton in the form of an ArrayList
    }
}

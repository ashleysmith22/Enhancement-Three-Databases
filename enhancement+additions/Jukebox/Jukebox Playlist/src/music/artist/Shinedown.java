package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Shinedown {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Shinedown() {
    }
    
    public ArrayList<Song> getShinedownSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Second Chance", "Shinedown");             //Create a song
         Song track2 = new Song("For My Sake", "Shinedown");         //Create another song
         Song track3 = new Song("Monsters", "Shinedown");                   //Add Monsters
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Shinedown
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Shinedown 
         this.albumTracks.add(track3);                                          //Add Penny Lane to the song list
         return albumTracks;                                                    //Return the songs for the Shinedown in the form of an ArrayList
    }
}


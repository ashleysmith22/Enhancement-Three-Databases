package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FleetwoodMac {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FleetwoodMac() {
    }
    
    public ArrayList<Song> getFleetwoodMacSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Dreams", "Fleetwood Mac");                           //Create a song
         Song track2 = new Song("Landslide", "Fleetwood Mac");                           //Create another song
         Song track3 = new Song("Rhiannon", "Fleetwood Mac");                           //Create another song
         Song track4 = new Song("Go Your Own Way", "Fleetwood Mac");                           //Create another song
         Song track5 = new Song("The Chain", "Fleetwood Mac");                           //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Fleetwood Mac
         this.albumTracks.add(track2);                                          //Add the second song to song list for Fleetwood Mac
         this.albumTracks.add(track3);                                          //Add the third song to song list for Fleetwood Mac
         this.albumTracks.add(track4);                                          //Add the fourth song to song list for Fleetwood Mac
         this.albumTracks.add(track5);                                          //Add the fifth song to song list for Fleetwood Mac
         return albumTracks;                                                    //Return the songs for Fleetwood Mac in the form of an ArrayList
    }
}

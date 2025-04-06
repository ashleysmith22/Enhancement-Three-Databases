package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class PaulMcCartney {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PaulMcCartney() {
    }
    
    public ArrayList<Song> getPaulMcCartneySongs() {
    	
    	 albumTracks = new ArrayList<Song>();
    	 Song track1 = new Song("Fine Line", "Paul McCartney");
         Song track2 = new Song("Despite Repeated Warnings", "Paul McCartney");
         Song track3 = new Song("My Brave Face", "Paul McCartney");
         this.albumTracks.add(track1);
         this.albumTracks.add(track2); 
         this.albumTracks.add(track3);
         return albumTracks;
    }
}

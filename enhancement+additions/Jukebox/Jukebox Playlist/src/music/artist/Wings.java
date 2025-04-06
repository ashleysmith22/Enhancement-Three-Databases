package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Wings {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Wings() {
    }
    
    public ArrayList<Song> getWingsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();
    	 Song track1 = new Song("Band On The Run", "Wings");
         Song track2 = new Song("Magneto And Titanium Man", "Wings");
         Song track3 = new Song("Junior's Farm", "Wings");
         Song track4 = new Song("Rockestra Theme", "Wings");
         this.albumTracks.add(track1);
         this.albumTracks.add(track2);
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         return albumTracks;
    }
}

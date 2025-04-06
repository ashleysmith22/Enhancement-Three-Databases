package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class MtJoy {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MtJoy() {
    }
    
    public ArrayList<Song> getMtJoySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Strangers", "Mt Joy");            
         Song track2 = new Song("Bug Eyes", "Mt Joy");         
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);                                          
         return albumTracks;                                                    
    }
}

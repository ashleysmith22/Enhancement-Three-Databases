package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class MacMiller {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public MacMiller() {
    }
    
    public ArrayList<Song> getMacMillerSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Programs", "Mac Miller");             			
         Song track2 = new Song("Buttons", "Mac Miller");   
    	 Song track3 = new Song("Complicated", "Mac Miller");             			
         Song track4 = new Song("The Spins", "Mac Miller");  
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);       
         this.albumTracks.add(track3);   
         this.albumTracks.add(track4);   
         return albumTracks;                                                   
    }
}

package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class CharlesBradley {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public CharlesBradley() {
    }
    
    public ArrayList<Song> getCharlesBradleySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   				//Instantiate the album so we can populate it below
    	 Song track1 = new Song("The World (Is going Up In Flames)", "Charles Bradley");        //Create a song
         Song track2 = new Song("Changes", "Charles Bradley");         							//Create another song
         Song track3 = new Song("I Feel A Change", "Charles Bradley");         					//Create another song
         this.albumTracks.add(track1);                                          				//Add the first song to song list for the Charles Bradley
         this.albumTracks.add(track2);                                          				//Add the second song to song list for the Charles Bradley
         this.albumTracks.add(track3);                                          				//Add the third song to song list for the Charles Bradley 
         return albumTracks;                                                    				//Return the songs for the Charles Bradley in the form of an ArrayList
    }
}

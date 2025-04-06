package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Rammstein {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Rammstein() {
    }
    
    public ArrayList<Song> getRammsteinSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Amerika", "Rammstein");                        //Create a song
         Song track2 = new Song("Fruehling in Paris", "Rammstein");             //Create another song
         Song track3 = new Song("Rosenrot", "Rammstein");            			//Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Rammstein
         this.albumTracks.add(track2);                                          //Add the second song to song list for Rammstein
         this.albumTracks.add(track3);											//Add the third song to the song list for Rammstein
         return albumTracks;                                                    //Return the songs for Rammstein in the form of an ArrayList
    }
}

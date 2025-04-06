package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class SimonGarfunkel {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public SimonGarfunkel() {
    }
    
    public ArrayList<Song> getSimonGarfunkelSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Sound of Silence", "Simon and Garfunkel");         				//Create a song
         Song track2 = new Song("The Boxer", "Simon and Garfunkel");        //Create another song
         Song track3 = new Song("Cecilia", "Simon and Garfunkel");       //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the third song to song list
         return albumTracks;                                            //Return the songs for SimonGarfunkel in the form of an ArrayList
    }
}
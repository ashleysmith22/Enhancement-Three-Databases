package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class HansZimmer {

	ArrayList<Song> albumTracks; // albumTracks is  an instance of class Song
    String albumTitle;
    
    public HansZimmer() {
    }
    
    public ArrayList<Song> getHansZimmerSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Dedicate global memory to arrayList albumTracks of data type Song. Data type song belong to the song class
    	 Song track0 = new Song("Time", "Hans Zimmer");         				//Create an instance of class song so it can be stored in the albumTracks array
         Song track1 = new Song("Interstellar", "Hans Zimmer");       
         Song track2 = new Song("The Dark Knight", "Hans Zimmer");
         this.albumTracks.add(track0);                                   //Add the first song to song arraylist
         this.albumTracks.add(track1);                                   //Add the second song to song arraylist
         this.albumTracks.add(track2);                                 
       
         return albumTracks;                                            //Return the HansZimmer songs to class Song in the form of an ArrayList
    }
}

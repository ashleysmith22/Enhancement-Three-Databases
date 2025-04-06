package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class PanicAtTheDisco {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PanicAtTheDisco() {
    }
    
    public ArrayList<Song> getPanicAtTheDiscoSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Hey Look Ma, I Made It", "Panic! at the Disco");         //Create a song
         
         this.albumTracks.add(track1);                                  //Add the first song to song list for Panic! at the Disco
         return albumTracks; 
    }
}


package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class TaylorSwift {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TaylorSwift() {
    }
    
    public ArrayList<Song> getTaylorSwiftSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Bad Blood", "Taylor Swift");         				//Create a song
      
         this.albumTracks.add(track1);                                  //Add the first song to song list
         
       
         return albumTracks;                                            //Return the songs for Taylor Swift in the form of an ArrayList
    }
}


package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class EnriqueIglesias {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public EnriqueIglesias() {
    }
    
    public ArrayList<Song> getEnriqueIglesiasSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Loco", "Enrique Iglesias");         				//Create a song
      
         this.albumTracks.add(track1);                                  //Add the first song to song list
         
       
         return albumTracks;                                            //Return the songs for Adele in the form of an ArrayList
    }
}


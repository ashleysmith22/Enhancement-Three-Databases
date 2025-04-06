//Created by Jeffrey Forte 
//SNHU CS-310-J6597 Collaboration and Team Projects
//August 2nd, 2020
package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class PinkFloyd {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PinkFloyd() {
    }
    
    public ArrayList<Song> getPinkFloydSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Cofortably Numb", "Pink Floyd");             //Create a song
         Song track2 = new Song("Another Brick in The Wall", "Pink Floyd");         //Create another song
         Song track3 = new Song("Goodbye, Blue Sky", "Pink Floyd");
         this.albumTracks.add(track1);                                          //Add the first song to song list for Pink Floyd
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Pink Floyd 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for Pink Floyd in the form of an ArrayList
    }
}

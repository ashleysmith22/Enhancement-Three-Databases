//Created by Jeffrey Forte 
//SNHU CS-310-J6597 Collaboration and Team Projects
//August 2nd, 2020

package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class VampireWeekend {
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public VampireWeekend() {
    }
    
    public ArrayList<Song> getVampireWeekendSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Sunflower", "Vampire Weekend");             	//Create a song
         Song track2 = new Song("A-Punk", "Vampire Weekend");         			//Create another song
         Song track3 = new Song("Father of the Bride", "Vampire Weekend");
         this.albumTracks.add(track1);                                          //Add the first song to song list for Vampire Weekend
         this.albumTracks.add(track2);                                          //Add the second song to song list for Vampire Weekend 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for Vampire Weekend in the form of an ArrayList
    }

}

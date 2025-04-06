package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class CattleDecapitation {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public CattleDecapitation() {
    }
    
    public ArrayList<Song> getCattleDecapitationSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Death Atlas", "Cattle Decapitation");          //Create a song
         Song track2 = new Song("Bring Back the Black", "Cattle Decapitation"); //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Cattle Decapitation
         this.albumTracks.add(track2);                                          //Add the second song to song list for Cattle Decapitation 
         return albumTracks;                                                    //Return the songs for Cattle Decapitation in the form of an ArrayList
    }
}
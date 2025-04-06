package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class RedHotChiliPeppers {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public RedHotChiliPeppers() {
    }
    
    public ArrayList<Song> getRedHotChiliPeppersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                               //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Californication", "Red Hot Chili Peppers");                //Create a song
         Song track2 = new Song("Under The Bridge", "Red Hot Chili Peppers");               //Create another song
         Song track3 = new Song("Scar Tissues", "Red Hot Chili Peppers");                   //Create another song
         Song track4 = new Song("Dani California", "Red Hot Chili Peppers");                //Create another song
         Song track5 = new Song("Snow", "Red Hot Chili Peppers");                           //Create another song
         this.albumTracks.add(track1);                                                      //Add the first song to song list for Red Hot Chili Peppers
         this.albumTracks.add(track2);                                                      //Add the second song to song list for Red Hot Chili Peppers 
         this.albumTracks.add(track3);                                                      //Add the third song to song list for Red Hot Chili Peppers 
         this.albumTracks.add(track4);                                                      //Add the fourth song to song list for Red Hot Chili Peppers 
         this.albumTracks.add(track5);                                                      //Add the fifth song to song list for Red Hot Chili Peppers 
         return albumTracks;                                                                //Return the songs for Red Hot Chili Peppers in the form of an ArrayList
    }
}

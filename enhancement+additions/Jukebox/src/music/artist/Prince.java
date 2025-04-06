package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Prince {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Prince() {
    }
    
    public ArrayList<Song> getPrinceSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                  		//Instantiate the album so we can populate it below
    	 Song track1 = new Song("When Doves Cry", "Prince");            			//Create a song
         Song track2 = new Song("Little Red Corvette", "Prince");         			//Create another song
         Song track3 = new Song("The Most Beautiful Girl in the World", "Prince");  //Create another song
         Song track4 = new Song("Baby, I'm a Star", "Prince");        				//Create another song
         Song track5 = new Song("I Wanna Be Your Lover", "Prince");      		 	//Create another song
         Song track6 = new Song("U Got the Look", "Prince");        				//Create another song
         Song track7 = new Song("Cream", "Prince");         						//Create another song
         Song track8 = new Song("Alphabet St.", "Prince"); 				       		//Create another song
         this.albumTracks.add(track1);                                          	//Add the first song to song list for Prince
         this.albumTracks.add(track2);                                          	//Add the second song to song list for Prince
         this.albumTracks.add(track3);                                          	//Add the third song to song list for Prince 
         this.albumTracks.add(track4);                                          	//Add the fourth song to song list for Prince 
         this.albumTracks.add(track5);                                         		//Add the fifth song to song list for Prince 
         this.albumTracks.add(track6);                                         		//Add the sixth song to song list for Prince 
         this.albumTracks.add(track7);                                         		//Add the seventh song to song list for Prince 
         this.albumTracks.add(track8);                                          	//Add the eighth song to song list for Prince 
         return albumTracks;                                                    	//Return the songs for Prince in the form of an ArrayList
    }
}

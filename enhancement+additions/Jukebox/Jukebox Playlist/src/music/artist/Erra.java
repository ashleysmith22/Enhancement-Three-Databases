//Kayla Lessard 
package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;
//added band Erra 
public class Erra {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Erra() {
    }
    
    public ArrayList<Song> getErraSongs() {
    	//added three Erra tracks (track title and band name)
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Breach", "Erra");         				//Create song
         Song track2 = new Song("Disarray", "Erra");        			//Create song
         Song track3 = new Song("Hybrid Earth", "Erra");       			//Create song
    	 Song track4 = new Song("Skyline", "Erra");         			//Create song
         Song track5 = new Song("Sleeper", "Erra");        				//Create song
         Song track6 = new Song("White Noise", "Erra");					//Create song
         this.albumTracks.add(track1);                                  //Add the song to song list
         this.albumTracks.add(track2);                                  //Add the song to song list
         this.albumTracks.add(track3);                                  //Add the song to song list
         this.albumTracks.add(track4);                                  //Add the song to song list
         this.albumTracks.add(track5);                                  //Add the song to song list
         this.albumTracks.add(track6); 
         return albumTracks;                                            //Return the songs 
    }
}
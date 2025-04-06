//Kayla Lessard
package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;
//added band Alexisonfire 
public class Alexisonfire {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Alexisonfire() {
    }
    
    public ArrayList<Song> getAlexisonfireSongs() {
    	//added Alexisonfire tracks (track title and band name)
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("This Could Be Anywhere In The World", "Alexisonfire");	//Create a song
         Song track2 = new Song("Boiled Frogs", "Alexisonfire");       				 //Create song
         Song track3 = new Song("Rough Hands", "Alexisonfire");     			    //Create song                           
    	 Song track4 = new Song("Accidents", "Alexisonfire");         				//Create song
         Song track5 = new Song("Side Walk When She Walks", "Alexisonfire");        //Create song
         Song track6 = new Song("Happiness By The Kilowatt", "Alexisonfire");       //Create song
         this.albumTracks.add(track1);                                  //Add song to list
         this.albumTracks.add(track2);                                  //Add song to list
         this.albumTracks.add(track3);									//Add song to list
         this.albumTracks.add(track4);                                  //Add song to list
         this.albumTracks.add(track5);                                  //Add song to list
         this.albumTracks.add(track6); 
         return albumTracks;                                            //Return the songs
    }
}
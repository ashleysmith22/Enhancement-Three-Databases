package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class JonasBrothers {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public JonasBrothers() {
    }
    
    public ArrayList<Song> getJonasBrothersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Waffle House", "Jonas Brothers");         				//Create a song
         Song track2 = new Song("Sucker", "Jonas Brothers");        //Create another song
         Song track3 = new Song("What A Man Gotta Do", "Jonas Brothers");       //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the third song to song list
         return albumTracks;                                            //Return the songs for Jonas Brothers in the form of an ArrayList
    }
}
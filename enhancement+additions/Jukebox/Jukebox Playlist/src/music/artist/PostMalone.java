package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class PostMalone {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PostMalone() {
    }
    
    public ArrayList<Song> getPostMaloneSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                           //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Sunflower", "Post Malone");         				//Create a song
         Song track2 = new Song("I Had Some Help", "Post Malone");        //Create another song
         Song track3 = new Song("Congratulations", "Post Malone");       //Create a third song
         this.albumTracks.add(track1);                                  //Add the first song to song list
         this.albumTracks.add(track2);                                  //Add the second song to song list
         this.albumTracks.add(track3);                                  //Add the third song to song list
         return albumTracks;                                            //Return the songs for Post Malone in the form of an ArrayList
    }
}
package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class BadBunny {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public BadBunny () {
    }
    
    public ArrayList<Song> getBadBunnySongs() {
    	
    	albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
   	 Song track1 = new Song("La Dificil", "Bad Bunny");        //Create a song
        Song track2 = new Song("25/8", "Bad BunnyA");             //Create another song
        Song track3 = new Song("A Tu Merced", "Bad Bunny");                //Create another song
        this.albumTracks.add(track1);                                          //Add the first song to song list for Bad Bunny
        this.albumTracks.add(track2);                                          //Add the second song to song list for Bad Bunny 
        this.albumTracks.add(track3);											//Add the third song to song list for Bad Bunny
        return albumTracks;                                                    //Return the songs for Bad Bunny in the form of an ArrayList

}
}
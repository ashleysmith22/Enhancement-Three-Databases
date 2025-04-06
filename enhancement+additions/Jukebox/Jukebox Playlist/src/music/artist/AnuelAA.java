package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class AnuelAA {

	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public AnuelAA () {
    }
    
    public ArrayList<Song> getAnuelAASongs() {
    	
    	albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
   	 Song track1 = new Song("Ferrari", "Anuel AA");        //Create a song
        Song track2 = new Song("China", "Anuel AA");             //Create another song
        Song track3 = new Song("Hasta Que Dios Diga", "Anuel AA");                //Create another song
        this.albumTracks.add(track1);                                          //Add the first song to song list for Anuel AA
        this.albumTracks.add(track2);                                          //Add the second song to song list for Anuel AA 
        this.albumTracks.add(track3);											//Add the third song to song list for Anuel AA
        return albumTracks;                                                    //Return the songs for Anuel AA in the form of an ArrayList

}
}

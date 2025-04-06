package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class Ween {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Ween() {
    }
    
    public ArrayList<Song> getWeenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                         //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Take Me Away", "Ween");             //Create a song
         Song track2 = new Song("Roses Are Free", "Ween");          //Create another song
         Song track3 = new Song("Voodoo Lady", "Ween");
         Song track4 = new Song("Candi", "Ween");
         
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Ween
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Ween 
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         
         return albumTracks;                                                    //Return the songs for the Ween in the form of an ArrayList
    }
}

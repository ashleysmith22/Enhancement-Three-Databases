package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class KingGnu {

	ArrayList<Song> albumTracks;
	String albumTitle;
	
	public KingGnu() {
		// Instantiate list of album tracks
		albumTracks = new ArrayList<Song>();
		Song track1 = new Song("Tokyo Rendez-Vous", "KingGnu");
		this.albumTracks.add(track1);
		
	}

	public ArrayList<Song> getKingGnuSongs() {

		return albumTracks;
	}
}

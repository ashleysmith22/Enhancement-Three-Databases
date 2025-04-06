package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Insomnium {

	ArrayList<Song> albumTracks;
	String albumTitle;

	public Insomnium() {
		// Instantiate list of album tracks
		albumTracks = new ArrayList<Song>();
		Song track1 = new Song("While We Sleep", "Insomnium");
		Song track2 = new Song("The Primeaval Dark", "Insomnium");
		Song track3 = new Song("Through the Shadows", "Insomnium");
		Song track4 = new Song("In the Groves of Death", "Insomnium");
		this.albumTracks.add(track1);
		this.albumTracks.add(track2);
		this.albumTracks.add(track3);
		this.albumTracks.add(track4);
	}

	public ArrayList<Song> getInsomniumSongs() {

		return albumTracks;
	}
}

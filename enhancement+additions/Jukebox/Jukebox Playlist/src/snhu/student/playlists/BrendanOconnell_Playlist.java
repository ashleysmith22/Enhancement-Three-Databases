package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BrendanOconnell_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();	// create new linked list for playlist
	
	/* add Allen Toussaint's track to playlist */
	ArrayList<Song> allenToussaintTracks = new ArrayList<Song>();		// create array for artist songs
    AllenToussaint allenToussaint = new AllenToussaint();				// instantiate object to access methods & properties	
    allenToussaintTracks = allenToussaint.getAllenToussaintSongs();		// invoke object's getSong() method	
	playlist.add(allenToussaintTracks.get(0));							// add object's 1st track to the playlist
	
	/* add Booker T.'s track to playlist */
	ArrayList<Song> bookerTracks = new ArrayList<Song>();	// create array for artist songs
    BookerT booker = new BookerT();							// instantiate object to access methods & properties	
    bookerTracks = booker.getBookerTSongs();				// invoke object's getSong() method	
	playlist.add(bookerTracks.get(0));						// add object's 1st track to the playlist

	/* add Curtis Mayfield's track to playlist */
	ArrayList<Song> curtisMayfieldTracks = new ArrayList<Song>();	// create array for artist songs
    CurtisMayfield curtisMayfield = new CurtisMayfield();			// instantiate object to access methods & properties	
    curtisMayfieldTracks = curtisMayfield.getCurtisMayfieldSongs();	// invoke object's getSong() method	
	playlist.add(curtisMayfieldTracks.get(0));						// add object's 1st track to the playlist
	
	/* add Professor Longhair's track to playlist */
	ArrayList<Song> professorLonghairTracks = new ArrayList<Song>();		// create array for artist songs
    ProfessorLonghair professorLonghair = new ProfessorLonghair();			// instantiate object to access methods & properties	
    professorLonghairTracks = professorLonghair.getProfessorLonghairSongs();// invoke object's getSong() method	
	playlist.add(professorLonghairTracks.get(0));							// add object's 1st track to the playlist
	
	/* add Fela Kuti's track to playlist */
	ArrayList<Song> felaKutiTracks = new ArrayList<Song>();	// create array for artist songs
    FelaKuti felaKuti = new FelaKuti();						// instantiate object to access methods & properties	
    felaKutiTracks = felaKuti.getFelaKutiSongs();			// invoke object's getSong() method	
	playlist.add(felaKutiTracks.get(0));					// add object's 1st track to the playlist
	
	/* add Hans Zimmer's track to playlist */
	ArrayList<Song> hansZimmerTracks = new ArrayList<Song>();	// create array for artist songs
    HansZimmer hansZimmer = new HansZimmer();					// instantiate object to access methods & properties	
    hansZimmerTracks = hansZimmer.getHansZimmerSongs();			// invoke object's getSong() method	
	playlist.add(hansZimmerTracks.get(1));						// add object's 2nd track to the playlist
	
	
    return playlist;	// return the complete linked playlist
	}
}

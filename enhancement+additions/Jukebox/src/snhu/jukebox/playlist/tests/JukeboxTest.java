package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	
	@Test
	public void testGetMacMillerAlbumSize() throws NoSuchFieldException, SecurityException {
		 MacMiller macMiller = new MacMiller();
		 ArrayList<Song> macMillerTracks = new ArrayList<Song>();
		 macMillerTracks = macMiller.getMacMillerSongs();
		 assertEquals(4, macMillerTracks.size());
	}
	
	
	@Test
	public void testGetMtJoyAlbumSize() throws NoSuchFieldException, SecurityException {
		 MtJoy mtJoy = new MtJoy();
		 ArrayList<Song> mtJoyTracks = new ArrayList<Song>();
		 mtJoyTracks = mtJoy.getMtJoySongs();
		 assertEquals(2, mtJoyTracks.size());
	}
	
	
	//Test for Vampire Weekend Album Size(3)Created by Jeffrey Forte
		@Test
		public void testGetVampireWeekendSize() throws NoSuchFieldException, SecurityException {
			 VampireWeekend vampireWeekend = new VampireWeekend();
			 ArrayList<Song> vampireWeekendTracks = new ArrayList<Song>();
			 vampireWeekendTracks = vampireWeekend.getVampireWeekendSongs();
			 assertEquals(3, vampireWeekendTracks.size());
		}
	//Test for Pink Floyd Album Size(3)Created by Jeffrey Forte
	@Test
	public void testGetPinkFloydAlbumSize() throws NoSuchFieldException, SecurityException {
		 PinkFloyd pinkFloyd = new PinkFloyd();
		 ArrayList<Song> pinkFloydTracks = new ArrayList<Song>();
		 pinkFloydTracks = pinkFloyd.getPinkFloydSongs();
		 assertEquals(3, pinkFloydTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test
	//added test for Alexisonfire (6 tracks)
	public void testGetAlexisonfiresAlbumSize() throws NoSuchFieldException, SecurityException {
		 Alexisonfire alexisonfire = new Alexisonfire();
		 ArrayList<Song> alexisonfiresTracks = new ArrayList<Song>();
		 alexisonfiresTracks = alexisonfire.getAlexisonfireSongs();
		 assertEquals(6, alexisonfiresTracks.size());
	}
	
	@Test
	//added test for Erra (6 tracks)
	public void testGetErraAlbumSize() throws NoSuchFieldException, SecurityException {
		 Erra erra = new Erra();
		 ArrayList<Song> errasTracks = new ArrayList<Song>();
		 errasTracks = erra.getErraSongs();
		 assertEquals(6, errasTracks.size());
	}

	//  Test that Linkin Park has 3 songs.
	@Test
	public void testGetLinkinParkAlbumSize() throws NoSuchFieldException, SecurityException {
		 LinkinPark linkinPark = new LinkinPark();
		 ArrayList<Song> linkinParkTracks = new ArrayList<Song>();
		 linkinParkTracks = linkinPark.getLinkinParkSongs();
		 assertEquals(3, linkinParkTracks.size());
	}

	//  Test that Bon Jovi artist has 4 songs.	
	@Test
	public void testGetBonJoviAlbumSize() throws NoSuchFieldException, SecurityException {
		 BonJovi bonJovi = new BonJovi();
		 ArrayList<Song> bonJoviTracks = new ArrayList<Song>();
		 bonJoviTracks = bonJovi.getBonJoviSongs();
		 assertEquals(4, bonJoviTracks.size());

	}
	
	// Test that Ween has 4 Songs
	@Test
	public void testWeenAlbumSize() throws NoSuchFieldException, SecurityException { 
		Ween ween = new Ween();
		ArrayList<Song> weenTracks = new ArrayList<Song>();
		weenTracks = ween.getWeenSongs();
		assertEquals(4, weenTracks.size());
	}
	
	// Test that DjangoReinhardt has 4 songs
	@Test
	public void testDjangoReinhardtAlbumSize() throws NoSuchFieldException, SecurityException { 
		DjangoReinhardt djangoReinhardt = new DjangoReinhardt();
		ArrayList<Song> djangoReinhardtTracks = new ArrayList<Song>();
		djangoReinhardtTracks = djangoReinhardt.getDjangoReinhardtSongs();
		assertEquals(4, djangoReinhardtTracks.size());
	}
	
	// Test that Queen has 2 songs
	@Test
	public void testQueenAlbumSize() throws NoSuchFieldException, SecurityException { 
		Queen queen = new Queen();
		ArrayList<Song> queenTracks = new ArrayList<Song>();
		queenTracks = queen.getQueenSongs();
		assertEquals(2, queenTracks.size());
	}
	
	// Test that Prince has 8 songs
	@Test
	public void testPrinceAlbumSize() throws NoSuchFieldException, SecurityException { 
		Prince prince = new Prince();
		ArrayList<Song> princeTracks = new ArrayList<Song>();
		princeTracks = prince.getPrinceSongs();
		assertEquals(8, princeTracks.size());
	}
	
	
	//seether
	@Test
	public void testGetSeetherAlbumSize() throws NoSuchFieldException, SecurityException {
		 Seether theSeetherBand = new Seether();
		 ArrayList<Song> seetherTracks = new ArrayList<Song>();
		 seetherTracks = theSeetherBand.getSeetherSongs();
		 assertEquals(2, seetherTracks.size());
	}
	
	//Frog Leap Studios
	@Test
	public void testGetFrogLeapStudiosAlbumSize() throws NoSuchFieldException, SecurityException {
		 FrogLeapStudios frogLeapStudios = new FrogLeapStudios();
		 ArrayList<Song> frogLeapTracks = new ArrayList<Song>();
		 frogLeapTracks = frogLeapStudios.getFrogLeapStudiosSongs();
		 assertEquals(3, frogLeapTracks.size());
	}
	
	@Test
	public void testGetHansZimmerAlbumSize() throws NoSuchFieldException, SecurityException {
		HansZimmer hansZimmer = new     HansZimmer(); // hansZimmer is a new instance of the class HansZimmer. hanZimmer has access to HansZimmer variables and methods.
		 ArrayList<Song> hansZimmerTracks = new ArrayList<Song>();  // This hansZimmerTracks is a new instance of class song. hansZimmerTracks is an array of instances of the class song. Class song has two attributes
		 // The first attribute is t for title. The second attribute is a  for artist
		 
		
		 hansZimmerTracks =  hansZimmer.getHansZimmerSongs(); // This will call an instance of the getHansZimmerSongs() funtion and store it in the hansZimmerTracks array
		 assertEquals(3, hansZimmerTracks.size()); // This will result in green if the left parameter is equal to the right parameter
		 //In other words, this will result in green, if 3 is equal to the size of the  hansZimmerTracks array
	}
	
	//JUnit test to ensure that Tupac has 3 songs on song list
	@Test
	public void testGetTupacAlbumSize() throws NoSuchFieldException, SecurityException {
		 Tupac tupac = new Tupac();
		 ArrayList<Song> tupacTracks = new ArrayList<Song>();
		 tupacTracks = tupac.getTupacSongs();
		 assertEquals(3, tupacTracks.size());
	}
	
	//JUnit test to ensure that JCole has 3 songs on song list
	@Test
	public void testGetJColeAlbumSize() throws NoSuchFieldException, SecurityException {
		 JCole jcole = new JCole();
		 ArrayList<Song> jcoleTracks = new ArrayList<Song>();
		 jcoleTracks = jcole.getJColeSongs();
		 assertEquals(3, jcoleTracks.size());
	}
	
}

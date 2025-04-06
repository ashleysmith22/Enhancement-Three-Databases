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
		 assertEquals(3, beatlesTracks.size());
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
	//Test for Anuel AA (3 Tracks)
	public void testGetAnuelAAAlbumSize() throws NoSuchFieldException, SecurityException {
		 AnuelAA anuelAA = new AnuelAA();
		 ArrayList<Song> anuelAAsTracks = new ArrayList<Song>();
		 anuelAAsTracks = anuelAA.getAnuelAASongs();
		 assertEquals(3, anuelAAsTracks.size());
	}
	
	@Test
	//Test for Bad Bunny (3 Tracks)
	public void testGetBadBunnyAlbumSize() throws NoSuchFieldException, SecurityException {
		 BadBunny badBunny = new BadBunny();
		 ArrayList<Song> badBunnysTracks = new ArrayList<Song>();
		 badBunnysTracks = badBunny.getBadBunnySongs();
		 assertEquals(3, badBunnysTracks.size());
	}
	
	@Test
	//added test for Alexisonfire (6 tracks)
	public void testGetAlexisonfiresAlbumSize() throws NoSuchFieldException, SecurityException {
		 Alexisonfire alexisonfire = new Alexisonfire();
		 ArrayList<Song> alexisonfiresTracks = new ArrayList<Song>();
		 alexisonfiresTracks = alexisonfire.getAlexisonfireSongs();
		 assertEquals(6, alexisonfiresTracks.size());
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
	
	//Test that Rammstein has 3 songs
	@Test
	public void testGetRammsteinAlbumSize() throws NoSuchFieldException, SecurityException {
		 Rammstein rammstein = new Rammstein();
		 ArrayList<Song> rammsteinTracks = new ArrayList<Song>();
		 rammsteinTracks = rammstein.getRammsteinSongs();
		 assertEquals(3, rammsteinTracks.size());
	}
	
	//Test that Dolly Parton has 2 songs
	@Test
	public void testGetDollyPartonAlbumSize() throws NoSuchFieldException, SecurityException {
		 DollyParton dollyParton = new DollyParton();
		 ArrayList<Song> dollyPartonTracks = new ArrayList<Song>();
		 dollyPartonTracks = dollyParton.getDollyPartonSongs();
		 assertEquals(2, dollyPartonTracks.size());
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
	//added test for Erra (6 tracks)
	public void testGetErraAlbumSize() throws NoSuchFieldException, SecurityException {
		 Erra erra = new Erra();
		 ArrayList<Song> errasTracks = new ArrayList<Song>();
		 errasTracks = erra.getErraSongs();
		 assertEquals(6, errasTracks.size());
	}
	
	// Test that Queen has 2 songs
	@Test
	public void testQueenAlbumSize() throws NoSuchFieldException, SecurityException { 
		Queen queen = new Queen();
		ArrayList<Song> queenTracks = new ArrayList<Song>();
		queenTracks = queen.getQueenSongs();
		assertEquals(5, queenTracks.size());
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
	
	
	// create test case for class AllenToussaint: method getAllenToussaintSongs()
	@Test
	public void testGetAllenToussaintAlbumSize() throws NoSuchFieldException, SecurityException {
		 AllenToussaint allenToussaint = new AllenToussaint(); 			// instantiate object to access AllenToussaint method's and properties
		 ArrayList<Song> allenToussaintTracks = new ArrayList<Song>();	// create variable for list of tracks
		 allenToussaintTracks = allenToussaint.getAllenToussaintSongs();// access object to populate song list
		 assertEquals(1, allenToussaintTracks.size()); 					// pass/fail test... expect 1 song for artist/album
	}
	
	// create test case for class BookerT: method getBookerTSongs()
	@Test
	public void testGetBookerTAlbumSize() throws NoSuchFieldException, SecurityException {
		 BookerT booker = new BookerT(); 						// instantiate object to access method's and properties
		 ArrayList<Song> bookerTracks = new ArrayList<Song>();	// create variable for list of tracks
		 bookerTracks = booker.getBookerTSongs();				// access object to populate song list
		 assertEquals(1, bookerTracks.size()); 					// pass/fail test... expect 1 song for artist/album
	}
	
	// create test case for class CurtisMayfield: method getCurtisMayfieldSongs()
	@Test
	public void testGetCurtisMayfieldAlbumSize() throws NoSuchFieldException, SecurityException {
		 CurtisMayfield curtisMayfield = new CurtisMayfield(); 			// instantiate object to access method's and properties
		 ArrayList<Song> curtisMayfieldTracks = new ArrayList<Song>();	// create variable for list of tracks
		 curtisMayfieldTracks = curtisMayfield.getCurtisMayfieldSongs();// access object to populate song list
		 assertEquals(1, curtisMayfieldTracks.size()); 					// pass/fail test... expect 1 song for artist/album
	}
		
	// create test case for class ProfessorLonghair: method getProfessorLonghairSongs()
	@Test
	public void testGetProfessorLonghairAlbumSize() throws NoSuchFieldException, SecurityException {
		 ProfessorLonghair professorLonghair = new ProfessorLonghair(); 		// instantiate object to access method's and properties
		 ArrayList<Song> professorLonghairTracks = new ArrayList<Song>();		// create variable for list of tracks
		 professorLonghairTracks = professorLonghair.getProfessorLonghairSongs();// access object to populate song list
		 assertEquals(1, professorLonghairTracks.size()); 						// pass/fail test... expect 1 song for artist/album
	}
	
	// create test case for class FelaKuti: method getFelaKutiSongs()
	@Test
	public void testGetFelaKutiAlbumSize() throws NoSuchFieldException, SecurityException {
		 FelaKuti felaKuti = new FelaKuti(); 					// instantiate object to access method's and properties
		 ArrayList<Song> felaKutiTracks = new ArrayList<Song>();// create variable for list of tracks
		 felaKutiTracks = felaKuti.getFelaKutiSongs();			// access object to populate song list
		 assertEquals(1, felaKutiTracks.size()); 				// pass/fail test... expect 1 song for artist/album
	}
	
	// create test case for class CattleDecapitation: method getCattleDecapitationSongs()
	@Test
	public void testGetCattleDecapitationAlbumSize() throws NoSuchFieldException, SecurityException {
		 CattleDecapitation cattleDecapitation = new CattleDecapitation(); 								// instantiate object to access method's and properties
		 ArrayList<Song> cattleDecapitationTracks = new ArrayList<Song>();								// create variable for list of tracks
		 cattleDecapitationTracks = cattleDecapitation.getCattleDecapitationSongs();					// access object to populate song list
		 assertEquals(2, cattleDecapitationTracks.size()); 												// pass/fail test... expect 2 song for artist/album
	}
	
	// create test case for class FleshgodApocalypse: method getFleshgodApocalypseSongs()
		@Test
		public void testGetFleshgodApocolypseAlbumSize() throws NoSuchFieldException, SecurityException {
			 FleshgodApocalypse fleshgodApocalypse = new FleshgodApocalypse(); 								// instantiate object to access method's and properties
			 ArrayList<Song> fleshgodApocalypseTracks = new ArrayList<Song>();								// create variable for list of tracks
			 fleshgodApocalypseTracks = fleshgodApocalypse.getFleshgodApocalypseSongs();					// access object to populate song list
			 assertEquals(3, fleshgodApocalypseTracks.size()); 												// pass/fail test... expect 3 song for artist/album
		}
	
	// create test case for class PaulMcCartney: method getPaulMcCartneySongs()
	@Test
	public void testPaulMcCartneyAlbumSize() throws NoSuchFieldException, SecurityException {
		 PaulMcCartney paulMcCartney = new PaulMcCartney(); 												// instantiate object to access method's and properties
		 ArrayList<Song> mcCartneyTracks = new ArrayList<Song>();											// create variable for list of tracks
		 mcCartneyTracks = paulMcCartney.getPaulMcCartneySongs();											// access object to populate song list
		 assertEquals(3, mcCartneyTracks.size()); 															// pass/fail test... expect 3 song for artist/album
	}
	
	// create test case for class Wings: method getWingsSongs()
	@Test
	public void testWingsAlbumSize() throws NoSuchFieldException, SecurityException {
		 Wings wings = new Wings(); 								                                        // instantiate object to access method's and properties
		 ArrayList<Song> wingsSongs = new ArrayList<Song>();				                				// create variable for list of tracks
		 wingsSongs = wings.getWingsSongs();																// access object to populate song list
		 assertEquals(4, wingsSongs.size()); 																// pass/fail test... expect 4 song for artist/album
	}
	// create test case for class Nickelback: method getNickelbackSongs()
		@Test
		public void testNickelbackAlbumSize() throws NoSuchFieldException, SecurityException {
			Nickelback nickelback = new Nickelback(); 								                                // instantiate object to access method's and properties
			 ArrayList<Song> nickelbackSongs = new ArrayList<Song>();				                				// create variable for list of tracks
			 nickelbackSongs = nickelback.getNickelbackSongs();														// access object to populate song list
			 assertEquals(2, nickelbackSongs.size()); 																// pass/fail test... expect 2 song for artist/album
		}
		// create test case for class Shinedown: method getShinedownSongs()
		@Test
		public void testShinedownAlbumSize() throws NoSuchFieldException, SecurityException {
			 Shinedown shinedown = new Shinedown(); 								                                // instantiate object to access method's and properties
			 ArrayList<Song> shinedownSongs = new ArrayList<Song>();				                				// create variable for list of tracks
			 shinedownSongs = shinedown.getShinedownSongs();														// access object to populate song list
			 assertEquals(3, shinedownSongs.size()); 																// pass/fail test... expect 3 song for artist/album
		}
		
	// create test case for class Coldplay: method getColdplaySongs()
	@Test
	public void testColdplayAlbumSize() throws NoSuchFieldException, SecurityException {
		 Coldplay coldplay = new Coldplay(); 								                                // instantiate object to access method's and properties
		 ArrayList<Song> coldplaySongs = new ArrayList<Song>();				                				// create variable for list of tracks
		 coldplaySongs = coldplay.getColdplaySongs();														// access object to populate song list
		 assertEquals(3, coldplaySongs.size()); 															// pass/fail test... expect 3 song for artist/album
	}
	
	// create test case for class OneRepublic: method getOneRepublicSongs()
	@Test
	public void testOneRepublicAlbumSize() throws NoSuchFieldException, SecurityException {
		 OneRepublic onerepublic = new OneRepublic(); 								                        // instantiate object to access method's and properties
		 ArrayList<Song> onerepublicSongs = new ArrayList<Song>();				                			// create variable for list of tracks
		 onerepublicSongs = onerepublic.getOneRepublicSongs();												// access object to populate song list
		 assertEquals(3, onerepublicSongs.size()); 															// pass/fail test... expect 3 song for artist/album
	}
}

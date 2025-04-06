package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import snhu.jukebox.playlist.Student;
import snhu.jukebox.playlist.StudentList;
import snhu.student.playlists.*;


public class StudentTest {

	//Test the list of student names and ensure we get back the name value we expect at the correct/specific point in the list
	@Test
	public void testGetStudentNameList1() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent1Name", studentNames.get(0));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	@Test
	public void testGetStudentNameList2() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("TestStudent2Name", studentNames.get(1));							//test case to see if the second value contains the name we expect
	}
	
	@Test
	public void testGetStudentNameLoganBurkham() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Logan Burkham", studentNames.get(6));								//test case to see if element six is Logan Burkham
	}
	
	
	//add test case for Brendan OConnell's name (index#8)
	@Test
	public void testGetBrendanOconnell() {
		List<String> studentNames = new ArrayList<String>();	//create variable for student list of names
		StudentList studentList = new StudentList();			//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();			//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Brendan OConnell", studentNames.get(8));	//test case for pass/fail of student's name
	}
	
	
	//add test case for Elijah Hickey's name (index#11)
	@Test
	public void testGetElijahHickey() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Elijah Hickey", studentNames.get(10));							//test case for pass/fail. Test to see if 10th element is Elijah Hickey
	}
	
	public void testGetJonathanHaro() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Jonathan Haro", studentNames.get(12));							//test case for pass/fail. Test to see if 11th element is Jonathan Haro
	}
		

	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	
	//add test case for Brendan OConnell's profile
	@Test
	public void testGetBrendanOconnellProfile() {
		BrendanOconnell_Playlist brendanOconnellPlaylist = new BrendanOconnell_Playlist();						//instantiating the variable
		Student BrendanOconnell = new Student("Brendan OConnell", brendanOconnellPlaylist.StudentPlaylist());	//creating populated student object
		assertEquals("Brendan OConnell", BrendanOconnell.getName());											//test case pass/fail line - does the name match expected?
	}
	

	
	//  Create a test for retrieval and access of Kayla Lessard profile
	@Test
	public void testGetKaylaLessardProfile() {
		KaylaLessard_Playlist testKaylaLessardPlaylist = new KaylaLessard_Playlist();
		Student KaylaLessard = new Student("KaylaLessard", testKaylaLessardPlaylist.StudentPlaylist());
		assertEquals("KaylaLessard", KaylaLessard.getName()); 
	}
	
	
	//  Create a test for Igor Mozheyko profile to make sure it can be retrieved and accessed.
	@Test
	public void testGetIgorMozheykoProfile() {
		IgorMozheyko_Playlist igorMozheykoPlaylist = new IgorMozheyko_Playlist();
		Student IgorMozheyko = new Student("Igor Mozheyko", igorMozheykoPlaylist.StudentPlaylist());
		assertEquals("Igor Mozheyko", IgorMozheyko.getName());
	}
	
	@Test
	public void testGetLoganBurkhamProfile() {
		LoganBurkham_Playlist loganBurkhamPlaylist = new LoganBurkham_Playlist();							//instantiating the variable for a specific student
		Student LoganBurkham = new Student("Logan Burkham", loganBurkhamPlaylist.StudentPlaylist());		//creating populated student object
		assertEquals("Logan Burkham", LoganBurkham.getName());												//test case pass/fail line
	}

	@Test
	public void testGetAparnaPyneniProfile() {
		AparnaPyneni_Playlist aparnaPyneniPlaylist = new AparnaPyneni_Playlist();						//instantiating the variable for a Aparna Pyneni student
		Student AparnaPyneni = new Student("Aparna Pyneni", aparnaPyneniPlaylist.StudentPlaylist());	//creating populated Aparna Pyneni object
		assertEquals("Aparna Pyneni", AparnaPyneni.getName());											//test case pass/fail line
	}
	
	//Added unit test to check for name
	@Test
	public void testKaylaLessard() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Kayla Lessard", studentNames.get(2));							    //test case to see if the second value contains the name we expect
	}
	
	@Test
	public void testGetStudentNameListIgorMozheyko() {
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		assertEquals("Igor Mozheyko", studentNames.get(3));
	}

	
	// Add Peter Pegues to testGetStudentName
	@Test
	public void testGetStudentNameListPeterPegues() {
		List<String> studentNames = new ArrayList<String>();  // Create var for student list of names
		StudentList studentList = new StudentList(); 		  // Instance the StudentList object
		studentNames = studentList.getStudentsNames();        // Populate the studentNameslist
		assertEquals("Peter Pegues", studentNames.get(4));    // Test Case for 3rd value
	}
	@Test
	public void testGetStudentAlfredo_Martinez() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Alfredo_Martinez", studentNames.get(5));							//test case to see if the second value contains the name we expect
	}
	
	//Add unit test for Merlin Nikodemus
	@Test
	public void testGetMerlinNikodemusProfile()
	{
		List<String> studentNames = new ArrayList<String>();   //Create variable for student list of names
		StudentList studentList = new StudentList();            //instantiate the Studentlist object so we can access its methods and properties 
		studentNames = studentList.getStudentsNames();          //populate the studentNames list with the actual values in the StudentList object
		assertEquals("Merlin Nikodemus", studentNames.get(9));     //test case to see if the ninth value contains the name we expect
	}
	
	//Added unit test to check for name
		@Test
		public void testJeffreyForte() {
			List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
			StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
			studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
			assertEquals("Jeffrey Forte", studentNames.get(11));
		}

	//Module 6 Test Case Area
	//Test each student profile to ensure it can be retrieved and accessed
	@Test
	public void testGetStudent1Profile() {
		TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();						//instantiating the variable for a specific student
		Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());		//creating populated student object
		assertEquals("TestStudent1", TestStudent1.getName());											//test case pass/fail line - did the name match what you expected?
	}
	
	@Test
	public void testGetStudent2Profile() {
		TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
		Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
		assertEquals("TestStudent2", TestStudent2.getName());
	}
	
	// Create a test for retrieval of Jeffrey Forte
	@Test
	public void testGetJeffreyForteProfile() {
		JeffreyForte_Playlist testJeffreyFortePlaylist = new JeffreyForte_Playlist();
		Student JeffreyForte = new Student("JeffreyForte", testJeffreyFortePlaylist.StudentPlaylist());
		assertEquals("JeffreyForte", JeffreyForte.getName());
	}
	
	// Create a test for Peter Pegues Profile
	@Test
	public void testGetPeterPeguesProfile() {
		PeterPegues_Playlist peterPeguesPlaylist = new PeterPegues_Playlist();
		Student PeterPegues = new Student("Peter Pegues", peterPeguesPlaylist.StudentPlaylist());
		assertEquals("Peter Pegues", PeterPegues.getName());
	}
	

	@Test
	public void testGetStudentAlfredoPlayList() {
		Alfredo_Martinez_Playlist alfredo_Martinez_Playlist = new Alfredo_Martinez_Playlist();
		Student Alfredo_Martinez = new Student("Alfredo_Martinez", alfredo_Martinez_Playlist.StudentPlaylist());
		assertEquals("Alfredo_Martinez", Alfredo_Martinez.getName());
	}
	
	@Test
	public void testGetStudentCharlesAllenPlayList() {
		CharlesAllen_Playlist CAllenPlayList = new CharlesAllen_Playlist();
		Student CharlesAllen = new Student("Charles Allen", CAllenPlayList.StudentPlaylist());
		assertEquals("Charles Allen", CharlesAllen.getName());
	}
	
	// // Create a test forJoshua Jimenez profile
		@Test
		public void testJoshuaJimenez() {
			List<String> studentNames = new ArrayList<String>();
			StudentList studentList = new StudentList();
			studentNames = studentList.getStudentsNames();
			assertEquals("Joshua Jimenez", studentNames.get(13));
		}
		
	// Create a test for Steven Wade
	@Test
	public void testStevenWade() {
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		assertEquals("Steven Wade", studentNames.get(14));
	}
	// Create a test for Kevin Tormey
		@Test
		public void testGetKevinTormey() {
			List<String> studentNames = new ArrayList<String>();   //Create variable for student list names
			StudentList studentList = new StudentList();      // Instantiate the Studentlist objects so we can access its methods and properties
			studentNames = studentList.getStudentsNames();  // Populate the studentNames list with the actual values in StudentList objects
			assertEquals("Kevin Tormey", studentNames.get(15));  // Test case to see if the fifteenth values contains the name we expect
		}
		
			
	// Create a test for Chris Parks
	@Test
	public void testChrisParks() {
		List<String> studentNames = new ArrayList<String>();	 //Create variable for student list names
		StudentList studentList = new StudentList();			 // Instantiate the Studentlist objects so we can access its methods and properties
		studentNames = studentList.getStudentsNames();			 // Populate the studentNames list with the actual values in StudentList objects
		assertEquals("Chris Parks", studentNames.get(16));		 // Test case to see if the sixteenth values contains the Chris Parks
	}
	
	//Create a test for Ashley Smith
			@Test
			public void testAshleySmith() {
				List<String> studentNames = new ArrayList<String>();     //Create variable for student list names
				StudentList studentList = new StudentList();			 // Instantiate the Studentlist objects so we can access its methods and properties
				studentNames = studentList.getStudentsNames();			 // Populate the studentNames list with the actual values in StudentList objects
				assertEquals("Ashley Smith", studentNames.get(17));		 // Test case to see if the seventeen values contains the Ashley Smith
			}	
	
}



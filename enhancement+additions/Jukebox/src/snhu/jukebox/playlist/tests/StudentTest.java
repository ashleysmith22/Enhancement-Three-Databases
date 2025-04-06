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
		List<String> studentNames = new ArrayList<String>(); 								// Create var for student list of names
		StudentList studentList = new StudentList(); 		  								// Instance the StudentList object
		studentNames = studentList.getStudentsNames();        								// Populate the studentNameslist
		assertEquals("Peter Pegues", studentNames.get(4));    								// Test Case for 3rd value
	}
	
	@Test
	public void testGetStudentAlfredo_Martinez() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Alfredo_Martinez", studentNames.get(5));							//test case to see if the second value contains the name we expect
	}
	
	@Test
	public void testGetStudentCinnamon_George()
	{
		List<String> studentNames = new ArrayList<String>();  							 //Create variable for student list of names
		StudentList studentList = new StudentList();            					  	 //instantiate the Studentlist object so we can access its methods and properties 
		studentNames = studentList.getStudentsNames();         							 //populate the studentNames list with the actual values in the StudentList object
		assertEquals("Cinnamon George", studentNames.get(6));    						 //test case to see if the second value contains the name we expect
	}

	// test of Sean Aceituno playlist if properly registered
	@Test
	public void testSeanAceituno() {
		List<String> studentNames = new ArrayList<String>();
		StudentList studentList = new StudentList();
		studentNames = studentList.getStudentsNames();
		assertEquals("Sean Aceituno", studentNames.get(8));
	}
	
	@Test
	public void testGetDennisPersaud() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Dennis Persaud", studentNames.get(9));							//test case for pass/fail. We expect the first name to be TestStudent1Name. Remember arrays start their count at 0 not 1.
	}
	
	//Added unit test to check for name
	@Test
	public void testJeffreyForte() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Jeffrey Forte", studentNames.get(11));
	}
	
	//Added unit test to check for correct name
	@Test
	public void testBrandonKwiatkowski() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Brandon Kwiatkowski", studentNames.get(12));						//test case to see if the second value contains the name we expect
	}
	
	@Test
	public void testGetStudentNameJuanPerez() {
		List<String> studentNames = new ArrayList<String>();							//create variable for student list of names
		StudentList studentList = new StudentList();									//instantiate the StudentList object so we can access it's methods and properties
		studentNames = studentList.getStudentsNames();									//populate the studentNames list with the actual values in the StudentsList object
		assertEquals("Juan Perez", studentNames.get(13));								//test case to check 6th value
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
	
	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList
	//  Create a test for retrieval and access of Kayla Lessard profile
	@Test
	public void testGetKaylaLessardProfile() {
		KaylaLessard_Playlist testKaylaLessardPlaylist = new KaylaLessard_Playlist();
		Student KaylaLessard = new Student("KaylaLessard", testKaylaLessardPlaylist.StudentPlaylist());
		assertEquals("KaylaLessard", KaylaLessard.getName()); 
	}
	
	// Create a test for retrieval of Jeffrey Forte
	@Test
	public void testGetJeffreyForteProfile() {
		JeffreyForte_Playlist testJeffreyFortePlaylist = new JeffreyForte_Playlist();
		Student JeffreyForte = new Student("JeffreyForte", testJeffreyFortePlaylist.StudentPlaylist());
		assertEquals("JeffreyForte", JeffreyForte.getName());
	}
	
	
	// Create a test for retrieval of brandon kwiatkowski
	@Test
	public void testGetBrandonKwiatkowskiProfile() {
		BrandonKwiatkowski_Playlist testBrandonKwiatkowskiPlaylist = new BrandonKwiatkowski_Playlist();
		Student BrandonKwiatkowski = new Student("BrandonKwiatkowski", testBrandonKwiatkowskiPlaylist.StudentPlaylist());
		assertEquals("BrandonKwiatkowski", BrandonKwiatkowski.getName());
	}
	
	//  Create a test for Igor Mozheyko profile to make sure it can be retrieved and accessed.
	@Test
	public void testGetIgorMozheykoProfile() {
		IgorMozheyko_Playlist igorMozheykoPlaylist = new IgorMozheyko_Playlist();
		Student IgorMozheyko = new Student("Igor Mozheyko", igorMozheykoPlaylist.StudentPlaylist());
		assertEquals("Igor Mozheyko", IgorMozheyko.getName());
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
	public void testGetStudentDennisPersaudPlaylist() {
		DennisPersaud_Playlist DennisPersaudPlaylist = new DennisPersaud_Playlist();
		Student DennisPersaud = new Student("Dennis Persaud", DennisPersaudPlaylist.StudentPlaylist());
		assertEquals("Dennis Persaud", DennisPersaud.getName());
	}
	
	@Test
	public void testGetStudentCharlesAllenPlayList() {
		CharlesAllen_Playlist CAllenPlayList = new CharlesAllen_Playlist();
		Student CharlesAllen = new Student("Charles Allen", CAllenPlayList.StudentPlaylist());
		assertEquals("Charles Allen", CharlesAllen.getName());
	}

	//Module 6 - Add your unit test case here to check for your profile after you have added it to the StudentList

	}



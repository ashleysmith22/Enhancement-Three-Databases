package snhu.jukebox.playlist;

import snhu.student.playlists.*;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public StudentList(){
	}

	public List<String> getStudentsNames() {
		ArrayList<String> studentNames = new ArrayList<String>();
		
		String StudentName1 = "TestStudent1Name";
		studentNames.add(StudentName1);
		
		String StudentName2 = "TestStudent2Name";
		studentNames.add(StudentName2);

		//added my name to create new student profile: Kayla Lessard
		String KaylaLessard = "Kayla Lessard";
		studentNames.add(KaylaLessard);

		// Add Igor Mozheyko to StudentList		
		String IgorMozheyko = "Igor Mozheyko";							//  Initialize variable IgorMozheyko as a string and set it to "Igor Mozheyko"
		studentNames.add(IgorMozheyko);									//  Add variable "Igor Mozheyko" to studentNames
		
		String PeterPegues = "Peter Pegues"; 							// Init var PeterPegues as a string set to "Peter Pegues"
		studentNames.add(PeterPegues); 							      	// Add var to studentNames
		
		String StudentName_Alfredo_Martinez = "Alfredo_Martinez";
		studentNames.add(StudentName_Alfredo_Martinez);
		
		//added my name in order to create a student profile
		String CinnamonGeorge = "Cinnamon George"; 						// Intial variable CinnamonGeorge as a string and set it to "Cinnamon George"
		studentNames.add(CinnamonGeorge); 								// Added variable "Cinnamon George" to studentNames

		String LoganBurkham = "Logan Burkham";							// Initializes variable LoganBurkham as a string and sets value
		studentNames.add(LoganBurkham);									// Adds variable LoganBurkham to studentNames
		
		// Add Sean Aceituno to StudentList
		String SeanAceituno = "Sean Aceituno";
		studentNames.add(SeanAceituno);
		
		// Add Dennis Persaud to StudentList
		String DennisPersaud = "Dennis Persaud";
		studentNames.add(DennisPersaud);
		
		// Add Charles Allen to StudentList
		String CharlesAllen = "Charles Allen";
		studentNames.add(CharlesAllen);
		
		// Add Jeffrey Forte to StudentList
		String JeffreyForte = "Jeffrey Forte";
		studentNames.add(JeffreyForte);
		
		// Add Brandon Kwiatkowski to StudentList
		String BrandonKwiatkowski = "Brandon Kwiatkowski";
		studentNames.add(BrandonKwiatkowski);
		
		//added Juan Perez to StudentList
		String JuanPerez = "Juan Perez";								//Initialized JuanPerez variable
		studentNames.add(JuanPerez);									//added variable to studentNames
		
		// Add Morgana Parsons to student profile
		String MParsons = "Morgana Parsons";
		studentNames.add(MParsons);


		return studentNames;
	}

	public Student GetStudentProfile(String student){
		Student emptyStudent = null;
	
		
		

        
		
		switch(student) {
		   case "TestStudent1_Playlist":
		   case "0": 
			   
			   TestStudent1_Playlist testStudent1Playlist = new TestStudent1_Playlist();
			   Student TestStudent1 = new Student("TestStudent1", testStudent1Playlist.StudentPlaylist());
			   return TestStudent1;
			 
		   case "TestStudent2_Playlist":
		   case "1":    
			   TestStudent2_Playlist testStudent2Playlist = new TestStudent2_Playlist();
			   Student TestStudent2 = new Student("TestStudent2", testStudent2Playlist.StudentPlaylist());
			   return TestStudent2;
			   
			   //added case statement for Kayla Lessard Playlist
		   case "KaylaLessard_Playlist":
		   case "2":    
			   KaylaLessard_Playlist KaylaLessardPlaylist = new KaylaLessard_Playlist();
			   Student KaylaLessard = new Student("KaylaLessard", KaylaLessardPlaylist.StudentPlaylist());
			   return KaylaLessard;
		   //Module 6 Code Assignment - Add your own case statement for your profile. Use the above case statements as a template.
	   
		   case "IgorMozheyko_Playlist": 
		   case "3":      
			   IgorMozheyko_Playlist igorMozheykoPlaylist = new IgorMozheyko_Playlist();
			   Student IgorMozheyko = new Student("Igor Mozheyko", igorMozheykoPlaylist.StudentPlaylist());
			   return IgorMozheyko;
		   
		   case "PeterPegues_Playlist":
		   case "4":   
			   PeterPegues_Playlist peterPeguesPlaylist = new PeterPegues_Playlist();
			   Student PeterPegues = new Student("Peter Pegues", peterPeguesPlaylist.StudentPlaylist());
			   return PeterPegues;
		   case "Alfredo_Martinez":
		   case "5":   
				
			   
				 //  alfredo_Martinez_Playlist is an instance of the Alfredo_Martinez_Playlist class.This will grant alfredo_Martinez_Playlist 
			//	   access to the methods and attributes of the Alfredo_Martinez_Playlist class
				    Alfredo_Martinez_Playlist alfredo_Martinez_Playlist = new Alfredo_Martinez_Playlist();
				    
				    
				    
				 // This will create an instance( Alfredo_Martinez) of the student class.
				    // The object  Alfredo_Martinez will call the default constructor method.
				    //The default constructor of the Student class takes a string and a link list as arguments
				    //The constructor creates a play list with the arguments
				   Student Alfredo_Martinez = new Student("Alfredo_Martinez", alfredo_Martinez_Playlist.StudentPlaylist());
				   
				   // This returns the play list to the object that calls the StudentPlaylist()); function
				   return Alfredo_Martinez;  
				   
				// add in case for Morgana Parsons
		   case "MorganaParsons_Playlist":
		   case "6":    
			   MParsons_Playlist MParsonsPlaylist = new MParsons_Playlist();
			   Student MParsons = new Student("Morgana Parsons", MParsonsPlaylist.StudentPlaylist());
			   return MParsons;
			   
		//Added in case for Dennis Persaud
		   case "DennisPersaud_Playlist":
		   case "7":
			   DennisPersaud_Playlist DennisPersaudPlaylist = new DennisPersaud_Playlist();
			   Student DennisPersaud = new Student("Dennis Persaud", DennisPersaudPlaylist.StudentPlaylist());
			   return DennisPersaud;

		//Added in case for Charles Allen
		   case "CharlesAllen_Playlist":
		   case "10":
			   CharlesAllen_Playlist CAllen = new CharlesAllen_Playlist();
			   Student CharlesAllen = new Student("Charles Allen", CAllen.StudentPlaylist());
			   return CharlesAllen;
			
	    //Added Case for Jeffrey Forte Playlist
		   case "JeffreyForte_Playlist":
		   case "11":    
			   JeffreyForte_Playlist jeffreyFortePlaylist = new JeffreyForte_Playlist();
			   Student JeffreyForte = new Student("JeffreyForte", jeffreyFortePlaylist.StudentPlaylist());
			   return JeffreyForte;
			   
			   
	   //Adding case for Brandon Kwiatkowski's Playlist
		   case "BrandonKwiatkowski_Playlist":
		   case "12":
			   BrandonKwiatkowski_Playlist brandonKwiatkowskiPlaylist = new BrandonKwiatkowski_Playlist();
			   Student BrandonKwiatkowski = new Student("BrandonKwiatkowski", brandonKwiatkowskiPlaylist.StudentPlaylist());
			   return BrandonKwiatkowski;
			   
			   
	  //Adding case 13 for Cory Lavigne's Playlist
		   case "CoryLavigne_Playlist":
		   case "13": 
			   
			   CoryLavigne_Playlist coryLavignePlaylist = new CoryLavigne_Playlist();
			   Student CoryLavigne = new Student("Cory Lavigne", coryLavignePlaylist.StudentPlaylist());
			   return CoryLavigne;
			   
			   //Adding case 14 for Cinnamon George's Playlist
		   case "CinnamonGeorge_Playlist":
		   case "14":
			   
			   CinnamonGeorge_Playlist cinnamonGeorgePlaylist = new CinnamonGeorge_Playlist();
			   Student CinnamonGeorge = new Student("Cinnamon George", cinnamonGeorgePlaylist.StudentPlaylist());
			   return CinnamonGeorge;
					   }
			return emptyStudent;
		}
	}

		  
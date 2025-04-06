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

		//  Add Igor Mozheyko to StudentList		
		String IgorMozheyko = "Igor Mozheyko";			//  Initialize variable IgorMozheyko as a string and set it to "Igor Mozheyko"
		studentNames.add(IgorMozheyko);					//  Add variable "Igor Mozheyko" to studentNames
		
		String PeterPegues = "Peter Pegues"; // Init var PeterPegues as a string set to "Peter Pegues"
		studentNames.add(PeterPegues);       // Add var to studentNames
		
		String StudentName_Alfredo_Martinez = "Alfredo_Martinez";
		studentNames.add(StudentName_Alfredo_Martinez);
		
		String LoganBurkham = "Logan Burkham";	//Initializes variable LoganBurkham as a string and sets value
		studentNames.add(LoganBurkham);			//Adds variable LoganBurkham to studentNames
		
		String AparnaPyneni = "Aparna Pyneni";	//Initializes variable AparnaPyneni as a string and sets value
		studentNames.add(AparnaPyneni);			//Adds variable AparnaPyneni to studentNames
		
		String BrendanOconnell = "Brendan OConnell"; // assign student name "Brendan OConnell" to string variable
		studentNames.add(BrendanOconnell);			// add student name variable to studentNames array
		
		String MerlinNikodemus = "Merlin Nikodemus";	//Initializes variable MerlinNikodemus as a string and sets value
		studentNames.add(MerlinNikodemus);			    //Adds variable MerlinNikodemus to studentNames
		
		String ElijahHickey = "Elijah Hickey";	//Initializes variable ElijahHickey as a string and sets value
		studentNames.add(ElijahHickey);			//Adds variable ElijahHickey to studentNames
		
		String JeffreyForte = "Jeffrey Forte";
		studentNames.add(JeffreyForte);
		
		String JonathanHaro = "Jonathan Haro";			//Initializes variable JonathanHaro as a string and sets value
		studentNames.add(JonathanHaro);					//Adds variable JonathanHaro to studentNames
		
		String JoshuaJimenez = "Joshua Jimenez";
		studentNames.add(JoshuaJimenez);
		
		String StevenWade = "Steven Wade"; // Initializes a string variable for Steven Wade
		studentNames.add(StevenWade); // Adds variable StevenWade to studentNames
		
		String KevinTormey = "Kevin Tormey";			//  Initialize variable KevinTormey as a string and set it to "Kevin Tormey"
		studentNames.add(KevinTormey);					//  Add variable "Kevin Tormey" to studentNames
		
		String ChrisParks = "Chris Parks";				//  Initialize variable ChrisParks as a string and set it to "Chris Parks"
		studentNames.add(ChrisParks);					//  Add variable "Chris Parks" to studentNames
		
		//added Ashley Smith to StudentList
		String AshleySmith = "Ashley Smith";
		studentNames.add(AshleySmith);
		
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
				   
		   case "LoganBurkham_Playlist":
		   case "6": 
			   
			   LoganBurkham_Playlist loganBurkhamPlaylist = new LoganBurkham_Playlist(); 							// Creates a variable instance of loganBurkhamPlaylist calling the LoganBurkham_Playlist() method
			   Student LoganBurkham = new Student("Logan Burkham", loganBurkhamPlaylist.StudentPlaylist());			// Creates a variable instance of student with appropriate name and play list called
			   return LoganBurkham;

			//Adding new case statement for AparnaPyneni Play list   
		   case "AparnaPyneni_Playlist":
		   case "7": 
			   
			   AparnaPyneni_Playlist aparnaPyneniPlaylist = new AparnaPyneni_Playlist(); 							// Creates a variable instance of loganBurkhamPlaylist calling the LoganBurkham_Playlist() method
			   Student AparnaPyneni = new Student("Aparna Pyneni", aparnaPyneniPlaylist.StudentPlaylist());			// Creates a variable instance of student with appropriate name and play list called
			   return AparnaPyneni;
			   
		   // add case for Brendan OConnell's playlist (8th on StudentList)
		   case "BrendanOconnell_Playlist":
		   case "8":
			   
			   BrendanOconnell_Playlist brendanOconnellPlaylist = new BrendanOconnell_Playlist();	//instantiate object to access its methods & properties
			   Student BrendanOconnell = new Student("Brendan OConnell", brendanOconnellPlaylist.StudentPlaylist());//create student profile name and attach playlist for return statement
			   return BrendanOconnell; //return the student's name and playlist from previous statement
			   
			// add case for Merlin Nikodemus' playlist (9th on StudentList)
		   case "MerlinNikodemus_Playlist":
		   case "9":
			   
			   MerlinNikodemus_Playlist merlinNikodemusPlaylist = new MerlinNikodemus_Playlist();	//instantiate object to access its methods & properties
			   Student MerlinNikodemus = new Student("Merlin Nikodemus", merlinNikodemusPlaylist.StudentPlaylist());//create student profile name and attach playlist for return statement
			   return MerlinNikodemus; //return the student's name and playlist from previous statement
			   
			// add case for Joshua Jimenez's playlist (10th on StudentList)
		   case "Joshua_Jimenez_Playlist":
		   case "10":
			   
			   Joshua_Jimenez_Playlist JoshuaJimenezPlaylist = new Joshua_Jimenez_Playlist();	//instantiate object to access its methods & properties
			   Student JoshuaJimenez = new Student("Joshua Jimenez", JoshuaJimenezPlaylist.StudentPlaylist());//create student profile name and attach playlist for return statement
			   return JoshuaJimenez; //return the student's name and playlist from previous statement
			   
			// add case for Chris Parks' playlist (16th on StudentList)
		   case "ChrisParks_Playlist":
		   case "16":
			   
			   ChrisParks_Playlist ChrisParksPlaylist = new ChrisParks_Playlist();	//instantiate object to access its methods & properties
			   Student ChrisParks = new Student("Chris Parks", ChrisParksPlaylist.StudentPlaylist());//create student profile name and attach playlist for return statement
			   return ChrisParks; //return the student's name and playlist from previous statement
			   
			 //add case for Ashley Smith's playlist (17th of StudentList)
		   case "Ashley_Smith_Playlist":
		   case "17":
			   Ashley_Smith_Playlist AshleySmithPlaylist = new Ashley_Smith_Playlist(); //instantiate object to access its methods & properties
			   Student AshleySmith = new Student("Ashley Smith", AshleySmithPlaylist.StudentPlaylist());//create student profile name and attach playlist for return statement
			   return AshleySmith; //return the student's name and playlist from previous statement
		}
			   
			return emptyStudent;
		}
	}
















		  
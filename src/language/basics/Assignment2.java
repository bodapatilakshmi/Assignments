package language.basics;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 semisters , 6 subjects, 5 values
		String[][][] btechResults = new String [5][2][6];
		//sem1
		btechResults [0][0][0]="Mathematics I";
		btechResults [0][1][0]="Pass(78)";
		
		btechResults[0][0][1] = "Physics";
		btechResults[0][1][1] = "Pass(85)";

		btechResults[0][0][2] = "Chemistry";
		btechResults[0][1][2] = "Fail(21)";
		
		btechResults[0][0][3] = "Computer Programming";
		btechResults[0][1][3] = "Pass(74)";
		
		btechResults[0][0][4] = "Engineering Drawing";
		btechResults[0][1][4] = "Pass(88)";
		
		btechResults[0][0][5] = "Basic Electrical Eng.";
		btechResults[0][1][5] = "Pass(79)";
		

        // Semester 2
		btechResults[1][0][0] = "Mathematics II";
		btechResults[1][1][0] = "Pass(82)";

		btechResults[1][0][1] = "Mechanics";
		btechResults[1][1][1] = "Pass(77)";

		btechResults[1][0][2] = "Environmental Sci.";
		btechResults[1][1][2] = "Pass(93)";
		
		btechResults[1][0][3] = "Basic Electronics";
		btechResults[1][1][3] = "Fail(19)";
		
		btechResults[1][0][4] = "Engineering Physics";
		btechResults[1][1][4] = "Fail(24)";
		
		btechResults[1][0][5] = "Engineering Graphics";
		btechResults[1][1][5] = "Pass(90)";
		
		//Semester 3
		btechResults[2][0][0] = "Data Structures";
		btechResults[2][1][0] = "Pass(88)";
		
		btechResults[2][0][1] = "Discrete Mathematics";
		btechResults[2][1][1] = "Pass(81)";
		
		btechResults[2][0][2] = "Digital Electronics";
		btechResults[2][1][2] = "Pass(76)";
		
		btechResults[2][0][3] = "Operating Systems";
		btechResults[2][1][3] = "Fail(32)";
		
		btechResults[2][0][4] = "Signals and Systems";
		btechResults[2][1][4] = "Pass(85)";
		
		btechResults[2][0][5] = "Object-Oriented Prog.";
		btechResults[2][1][5] = "Pass(78)";
		
		//Semester 4
		btechResults[3][0][0] = "Algorithms";
		btechResults[3][1][0] = "Pass(91)";
		
		btechResults[3][0][1] = "Computer Networks";
		btechResults[3][1][1] = "Pass(73)";
		
		btechResults[3][0][2] = "Database Systems";
		btechResults[3][1][2] = "Fail(19)";
		
		btechResults[3][0][3] = "Microprocessors";
		btechResults[3][1][3] = "Pass(80)";
		
		btechResults[3][0][4] = "Communication Eng.";
		btechResults[3][1][4] = "Pass(76)";
		
		btechResults[3][0][5] = "Software Engineering";
		btechResults[3][1][5] = "Pass(87)";
		
	
		//Semester 5
		btechResults[4][0][0] = "Probability Stats";
		btechResults[4][1][0] = "Pass(86)";
		
		btechResults[4][0][1] = "Machine Learning";
		btechResults[4][1][1] = "Pass(88)";
		
		btechResults[4][0][2] = "Compiler Design";
		btechResults[4][1][2] = "Pass(84)";
		
		btechResults[4][0][3] = "Theory of Computation";
		btechResults[4][1][3] = "Pass(95)";
		
		btechResults[4][0][4] = "Embedded Systems";
		btechResults[4][1][4] = "Pass(73)";
		
		btechResults[4][0][5] = "Computer Graphics";
		btechResults[4][1][5] = "Pass(90)";
		
		//Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 Subject 4 name is :"+" "+btechResults[1][0][3]);
		System.out.println("Semester 2 Subject 5 name is :"+" "+btechResults[1][0][4]);


		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Status/Marks of Semester 4 Subject 3 is:"+" "+btechResults[3][1][2]);
		System.out.println("Status/Marks of Semester 4 Subject 6 is:"+" "+btechResults[3][1][5]);

	}

}

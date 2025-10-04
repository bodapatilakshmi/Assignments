package collections;

import java.util.HashMap;
import java.util.Map;

public class StudentDetails {

	public static void main(String[] args) {
		//Student Names and Roll numbers
    Map<String, String> studentsName = new HashMap<String, String>();
    studentsName.put("John Doe", "SBA12345");
    studentsName.put("Jane Smith", "SBA12346");
    studentsName.put("Mike Brown", "SBA12347");
    System.out.println("Students Names and Roll Numbers: "+studentsName);
    //Students Age
    Map<String, String> studentsAge = new HashMap<String, String>();
    studentsAge.put("John Doe", "Twenty");
    studentsAge.put("Jane Smith", "Twenty One");
    studentsAge.put("Mike Brown", "Twenty Two");
    System.out.println("Students Age: "+studentsAge);
    
    //Students Gender
    Map<String, String> studentsGender = new HashMap<String, String>();
    studentsGender.put("John Doe", "Male");
    studentsGender.put("Jane Smith", "Female");
    studentsGender.put("Mike Brown", "Male");
    System.out.println("Students Gender: "+studentsGender);
    
    //Students grade
    Map<String, String> studentsGrade = new HashMap<String, String>();
    studentsGrade.put("John Doe", "A++");
    studentsGrade.put("Jane Smith", "B+");
    studentsGrade.put("Mike Brown", "A+");
    System.out.println("Students grade: "+studentsGrade);
    
    //Students Major subject
    Map<String, String> studentsMajor = new HashMap<String, String>();
    studentsMajor.put("John Doe", "Computer Science");
    studentsMajor.put("Jane Smith", "Mathematics");
    studentsMajor.put("Mike Brown", "Physics");
    System.out.println("Students Major subject: "+studentsMajor);
    
    //Students GPA
    Map<String, String> studentsGpa = new HashMap<String, String>();
    studentsGpa.put("John Doe", "A3.8");
    studentsGpa.put("Jane Smith", "A3.5");
    studentsGpa.put("Mike Brown", "A3.9");
    System.out.println("Students GPA: "+studentsGpa);
    
    //Students Email
    Map<String, String> studentsEmail = new HashMap<String, String>();
    studentsEmail.put("John Doe", "john@example.com");
    studentsEmail.put("Jane Smith", "jane@example.com");
    studentsEmail.put("Mike Brown", "mike@example.com");
    System.out.println("Students Email: "+studentsEmail);
    
  //Students PAN Number
    Map<String, String> studentsPan = new HashMap<String, String>();
    studentsPan.put("John Doe", "SDF6543210");
    studentsPan.put("Jane Smith", "REW6543211");
    studentsPan.put("Mike Brown", "TYR6543212");
    System.out.println("Students PAN Number: "+studentsPan);
    
  //Students Address
    Map<String, String> studentsAddrs = new HashMap<String, String>();
    studentsAddrs.put("John Doe", "123 Elm St");
    studentsAddrs.put("Jane Smith", "456 Oak St");
    studentsAddrs.put("Mike Brown", "789 Pine St");
    System.out.println("Students Address: "+studentsAddrs);
	}

}

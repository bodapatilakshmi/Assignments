package collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeDetails {

	public static void main(String[] args) {
		// Employee Name and ID
		Map<String, String> empName = new HashMap<String, String>();
		empName.put("Alice Green", "E001");
		empName.put("Bob Johnson", "E002");
		empName.put("Carol White", "E003");
		System.out.println("Employee Names and ID: "+empName);
		
		       // Employee Age
				Map<String, String> empAge = new HashMap<String, String>();
				empAge.put("Alice Green", "Thirty");
				empAge.put("Bob Johnson", "Thirty Five");
				empAge.put("Carol White", "Twenty Eight");
				System.out.println("Employee Age: "+empAge);
				
				// Employee Gender
				Map<String, String> empGender = new HashMap<String, String>();
				empGender.put("Alice Green", "Female");
				empGender.put("Bob Johnson", "Male");
				empGender.put("Carol White", "Female");
				System.out.println("Employee Gender: "+empGender);
				
				// Employee Department
				Map<String, String> empDept = new HashMap<String, String>();
				empDept.put("Alice Green", "Engineering");
				empDept.put("Bob Johnson", "Marketing");
				empDept.put("Carol White", "Sales");
				System.out.println("Employee Department: "+empDept);
				
				// Employee Position
				Map<String, String> empPosition = new HashMap<String, String>();
				empPosition.put("Alice Green", "Software Engineer");
				empPosition.put("Bob Johnson", "Marketing Manager");
				empPosition.put("Carol White", "Sales Executive");
				System.out.println("Employee Position: "+empPosition);
				
				// Employee Salary
				Map<String, String> empSal = new HashMap<String, String>();
				empSal.put("Alice Green", "75K Pounds");
				empSal.put("Bob Johnson", "85K Pounds");
				empSal.put("Carol White", "65K Pounds");
				System.out.println("Employee Salary: "+empSal);
				
				// Employee Email
				Map<String, String> empEmail = new HashMap<String, String>();
				empEmail.put("Alice Green", "alice@example.com");
				empEmail.put("Bob Johnson", "bob@example.com");
				empEmail.put("Carol White", "carol@example.com");
				System.out.println("Employee Email: "+empEmail);
				
				// Employee PAN Number
				Map<String, String> empPan = new HashMap<String, String>();
				empPan.put("Alice Green", "SDF6543210");
				empPan.put("Bob Johnson", "REW6543211");
				empPan.put("Carol White", "TYR6543212");
				System.out.println("Employee PAN Number: "+empPan);			
				
	}

}

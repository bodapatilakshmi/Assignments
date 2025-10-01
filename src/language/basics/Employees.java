package language.basics;

public class Employees {

	String empName1 = "Bharath";
	String empName2 = "Lakshmi";
	String empName3 = "Durga";

	int empId1 = 1234;
	int empId2 = 1247;
	int empId3 = 1346;

	public static void main(String[] args) {

		Employees emp = new Employees();
		System.out.println("First employee name is:" + "" + emp.empName1);
		System.out.println("Second employee name is:" + "" + emp.empName2);
		System.out.println("Third employee ID is:" + "" + emp.empId3);
	}

}

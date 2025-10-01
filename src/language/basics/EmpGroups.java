package language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		String[] empNames = new String [3];
		int [] empIds = new int [3];
		
	  Employees emp = new Employees();
	    empNames[0]= emp.empName1;
	    empNames[1]= emp.empName2;
	    empNames[2]= emp.empName3;
	    
	    empIds[0]= emp.empId1;
	    empIds[1]=emp.empId2;
	    empIds[2]=emp.empId3;
      
      System.out.println("First Employee Name is:"+empNames[0]+" and Employee Id is: "+empIds[0]);
      System.out.println("Second Employee Name is:"+empNames[1]+" and Employee Id is: "+empIds[1]);
      System.out.println("Third Employee Name is:"+empNames[2]+" and Employee Id is: "+empIds[2]);        
	}
}

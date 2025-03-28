package javaBasic_udayme;

public class Day5_Employee {
	
	int Id = 0;
	String name ;
	String roll ;
	String project;
	int salaray;
	
	
	public void display() {
		System.out.println("Employe id : "+ Id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Roll : "+roll);
		System.out.println("Employee Project :  "+ project);
		System.out.println("Employee Salary :  "+ salaray);
	}
	
	public static void main(String[] args) {
		
		Day5_Employee ravi = new Day5_Employee();
		ravi.Id = 25487;
		ravi.name = "Ravi Teja Varma";
		ravi.roll = "Senior software Engineer";
		ravi.project = " CTE";
		ravi.salaray = 1000000;
		ravi.display();
		
		Day5_Employee abe = new Day5_Employee();
		abe.Id = 254587;
		abe.name = "abeeee";
		abe.roll = " Tester";
		abe.project = "asdffe";
		abe.salaray  = 2000000;
		abe.display();
		
		
	}
	

}

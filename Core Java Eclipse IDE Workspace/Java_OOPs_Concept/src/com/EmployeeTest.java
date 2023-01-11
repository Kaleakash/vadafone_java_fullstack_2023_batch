package com;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.displayEmpInfo();		// default value 
		
		Employee emp2  = new Employee();
		emp2.id=2;
		emp2.name="John";
		emp2.salary=25000;
		emp2.displayEmpInfo();   // set the value and display the value
		
		Employee emp3 = new Employee();
		emp3.setEmpInfo(3, "Lex", 28000);  // we pass the value 
		emp3.displayEmpInfo();
		
		Employee emp4 = new Employee();
		emp4.setEmpInfo(4, "Neena", 32000);
		emp4.setEmpInfo(6, "Raj", 38000);
		emp4.calSalary();
		emp4.displayEmpInfo();
		
		Employee emp5 = new Employee(5, "Steven", 26000);
		emp5.calSalary();
		emp5.displayEmpInfo();
	}

}

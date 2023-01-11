package com;

public class Employee {
	int id;
	String name;
	float salary;
	//Empty constructor 
	public Employee() {
		id =123;
		name ="Unknown";
		salary =8000;
	}
	// parameter constructor 
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void setEmpInfo(int id, String name, float salary) {
		this.id =id;			// left side is instance or right side is local 
		this.name = name;
		this.salary=salary;
	}
	void calSalary() {
		float bonus = 5000;
		salary = salary+bonus;
	}
	void displayEmpInfo() {
		System.out.println("Id is "+id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
}

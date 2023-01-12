package com;

public class Developer extends Employee{

	private String projectName;
	void readDev() {
		readEmp();
		System.out.println("Enter the project name");
		projectName = sc.next();
	}
	
	void disDev() {
		disEmp();
		System.out.println("Project name is "+projectName);
	}
}

package com;

public class Manager extends Employee{
	private int numberOfEmp;
	Address add = new Address();
	void readMgr() {
		readEmp();				//ask enter id,name,salary
		System.out.println("Enter the number of employee working under him");
		numberOfEmp = sc.nextInt();
		add.readAdd();				// ask city and state 
	}
	
	void disMgr() {
		disEmp();
		System.out.println("Number of Employee working under him "+numberOfEmp);
		add.disAdd();
	}
}

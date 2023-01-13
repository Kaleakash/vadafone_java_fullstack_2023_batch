package com;

public class Manager extends Employee{
private int numberOfEmp;
int deptId =200;
	public Manager(){
		super();
		System.out.println("Manager class object created..");
	}
	public Manager(int id, String name, float salary, int numberOfEmp) {
		super(id,name,salary);  // calling explicitly parameter constructor 
		this.numberOfEmp = numberOfEmp;
	}
	public void disMgr() {
		disEmp();
		System.out.println("Number of emp "+this.numberOfEmp);
	}
	
	public void disDeptInfo() {
		int deptId=300;
		System.out.println("local variable "+deptId);  // local variable 
		System.out.println(" instance variable "+this.deptId);  // instance variable 
		System.out.println(" super class variable "+super.deptId); // super class variable 
	}
}

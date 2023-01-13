package com;

public abstract class Employee {
private int id;
private String name;
private float salary;

int deptId=100;
	public Employee() {
		System.out.println("Employee class object created..");
	}
	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void disEmp() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}

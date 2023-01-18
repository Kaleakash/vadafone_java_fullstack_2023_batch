package com;

import java.io.Serializable;

public class Employee implements Serializable{
private int id;
private String name;
private float salary;

public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public void display() {
	System.out.println("Id is "+id);
	System.out.println("Name is "+name);
	System.out.println("Salary is "+salary);
}
}

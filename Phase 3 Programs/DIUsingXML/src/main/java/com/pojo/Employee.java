package com.pojo;

public class Employee {
private int id;
private String name;
private float salary;

	public void display() {
		System.out.println("This is simple display method");
	}
	public Employee() {
		System.out.println("object created...");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

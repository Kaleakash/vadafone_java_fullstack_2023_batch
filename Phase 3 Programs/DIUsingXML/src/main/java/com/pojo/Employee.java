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
	
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("object created using parameter");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

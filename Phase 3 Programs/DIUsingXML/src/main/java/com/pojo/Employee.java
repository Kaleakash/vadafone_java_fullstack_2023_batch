package com.pojo;

public class Employee {
private int id;
private String name;
private float salary;
private Address add;
//private Address padd;
	public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}

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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", add=" + add + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}

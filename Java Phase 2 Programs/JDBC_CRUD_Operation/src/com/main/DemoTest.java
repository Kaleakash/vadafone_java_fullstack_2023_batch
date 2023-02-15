package com.main;

import java.util.Scanner;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {//	EmployeeService es = new EmployeeService();
		Scanner sc = new Scanner(System.in);
		EmployeeService es = new EmployeeService();
		int choice;
		int id;
		String name;
		float salary;
		String result;
		String con;
		do {
			System.out.println("1:Add Employee");
			System.out.println("Plz enter your choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Add Employee details");
				  System.out.println("Enter the id");
				  id = sc.nextInt();
				  System.out.println("Enter the name");
				  name = sc.next();
				  System.out.println("Enter the salary");
				  salary = sc.nextFloat();
				  Employee emp = new Employee();
				  emp.setId(id);
				  emp.setName(name);
				  emp.setSalary(salary);
				  result = es.storeEmployee(emp);
				  System.out.println(result);
				  break;
			default:System.out.println("Wrong choice");
			     break;
			}
			System.out.println("Do you want to continue?(yes/no)");
		con = sc.next();
		} while (con.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
	}

}

package com.main;

import java.util.Iterator;
import java.util.List;
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
			System.out.println("1:Add Employee 2 : Update Employee Salary 3 :Delete the Employee record 4: Get All Employee records");
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
			case 2: System.out.println("Update Salary");
					System.out.println("Enter the id");
					id = sc.nextInt();
					System.out.println("Enter the salary");
					salary = sc.nextFloat();
					Employee emp1 = new Employee();
					emp1.setId(id);
					emp1.setSalary(salary);
					result = es.updateEmployee(emp1);
					System.out.println(result);
					break;
			case 3:System.out.println("Delete record");
			       System.out.println("Enter the id");
			       id = sc.nextInt();
			       result = es.deleteEmployeeRecord(id);
			       System.out.println(result);
			       break;
			case 4:System.out.println("All Employee details");
			       List<Employee> listOfEmp = es.getAllEmployee();
			       Iterator<Employee> li = listOfEmp.iterator();
			       while(li.hasNext()) {
			    	   Employee e = li.next();
			    	   System.out.println("id is "+e.getId()+" Name is "+e.getName()+" salary is "+e.getSalary());
			       }
			       break;
			       
			       
			default:System.out.println("Wrong choice");
			     break;
			}
			System.out.println("Do you want to continue?(yes/no)");
		con = sc.next();
		} while (con.equalsIgnoreCase("yes"));
		System.out.println("Thank you!");
		
		sc.close();
	}

}

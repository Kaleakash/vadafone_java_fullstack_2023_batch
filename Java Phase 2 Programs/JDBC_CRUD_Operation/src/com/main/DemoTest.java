package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
	Employee emp = new Employee();
	emp.setId(4);
	emp.setName("Mahesh");
	emp.setSalary(18000);
	
	EmployeeService es = new EmployeeService();
	String result = es.storeEmployee(emp);
	System.out.println(result);

	}

}

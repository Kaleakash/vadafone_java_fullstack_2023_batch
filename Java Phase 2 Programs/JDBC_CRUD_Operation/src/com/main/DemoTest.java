package com.main;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
	emp.setId(10);
	emp.setName("John");
	emp.setSalary(10000);
	
	// emp, which hold one employee record which map to database table record 
	
	EmployeeService es = new EmployeeService();
	String result = es.storeEmployee(emp);
	System.out.println(result);

	}

}

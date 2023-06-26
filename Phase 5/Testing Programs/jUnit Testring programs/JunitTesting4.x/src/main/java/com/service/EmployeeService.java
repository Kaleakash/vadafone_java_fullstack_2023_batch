package com.service;

import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {

	public Employee getEmployee() {
		Employee emp = new Employee(100, "Lex", 16000);
		return emp;
	}
	public List<Employee> getAllEmployees() {
		Employee emp1 = new Employee(100, "Lex", 16000);
		Employee emp2 = new Employee(101, "Martin", 19000);
		Employee emp3 = new Employee(102, "John", 21000);
		List<Employee> listofEmp = new ArrayList<>();
		listofEmp.add(emp1);
		listofEmp.add(emp2);
		listofEmp.add(emp3);
		return listofEmp;
	}
	public float updateSalary(Employee emp) {
		// with some condition update salary 
		emp.setSalary(emp.getSalary()+5000);
		return emp.getSalary();
	}
	public boolean checkUser(String emailid, String password) {
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			return true;
		}else {
			return false;
		}
	}
}

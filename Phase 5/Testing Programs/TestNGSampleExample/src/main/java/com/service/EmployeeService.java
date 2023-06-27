package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Employee;

public class EmployeeService {
	List<Employee> listOfEmp = new ArrayList<>();
	public EmployeeService() {
	listOfEmp.add(new Employee(100, "Ravi", 12000));
	listOfEmp.add(new Employee(101, "Ramesh", 18000));
	listOfEmp.add(new Employee(102, "Steven", 19000));
	listOfEmp.add(new Employee(103, "Lex", 21000));
	}
	
	public List<Employee> getAllEmployee() {
		return listOfEmp;
	}
	
	public Employee searchEmployee(int id) {
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			if(emp.getId()==id) {
				return emp;
			}
		}
		return null;
	}
	public String storeEmployee(Employee emp) {
		int flag = 0;
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee e = li.next();
			if(e.getId()==emp.getId()) {
				flag++;
				break;
			}
		}
		if(flag!=0) {
			return "Employee record didn't store";
		}else {
			listOfEmp.add(emp);
			flag = 0;
			return "Record stored";
		}
	}
}



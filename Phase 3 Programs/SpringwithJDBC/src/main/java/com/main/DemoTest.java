package com.main;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {

ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	// insert Query 
//	Employee emp = (Employee)ac.getBean("employee");
//	emp.setId(1);
//	emp.setName("Leena");
//	emp.setSalary(13000);
//	
//	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//	
//	String result = es.storeEmployee(emp);
//	System.out.println(result);

	// Retrieve Query 
	EmployeeService es = (EmployeeService)ac.getBean("employeeService");
	List<Employee> listOfEmp = es.findAllEmployee();
	Iterator<Employee> li = listOfEmp.iterator();
	while(li.hasNext()) {
		Employee e = li.next();
		System.out.println(e);
	}
	}

}

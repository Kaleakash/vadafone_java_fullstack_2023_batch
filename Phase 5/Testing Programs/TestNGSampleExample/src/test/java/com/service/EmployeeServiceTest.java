package com.service;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.List;

import org.testng.annotations.Test;

import com.bean.Employee;

public class EmployeeServiceTest {

  @Test
  public void getAllEmployeeTest() {
   // throw new RuntimeException("Test not implemented");
	  EmployeeService es = new EmployeeService();
	  List<Employee> listOfEmp = es.getAllEmployee();
	  assertEquals(listOfEmp.size(), 4);
	  Employee emp = listOfEmp.get(0);
	  assertEquals(emp.getId(), 100);
	  assertEquals(emp.getName(), "Ravi");
	  assertEquals(emp.getSalary(), 12000);
  }

  @Test
  public void searchEmployeeTest() {
    //throw new RuntimeException("Test not implemented");
	  EmployeeService es = new EmployeeService();
	  Employee emp1 = es.searchEmployee(100);
	  Employee emp2 = es.searchEmployee(1000);
	  assertNotNull(emp1);
	  assertEquals(emp1.getSalary(), 12000);
	  assertNull(emp2);
  }

  @Test
  public void storeEmployeeTest() {
    Employee emp1 = new Employee(100, "Neena", 18000);
    Employee emp2 = new Employee(108, "Veena", 20000);
   EmployeeService es = new EmployeeService();
   String result1 = es.storeEmployee(emp1);
   String result2 = es.storeEmployee(emp2);
   assertEquals(result1, "Employee record didn't store");
   assertEquals(result2, "Record stored");
  }
}





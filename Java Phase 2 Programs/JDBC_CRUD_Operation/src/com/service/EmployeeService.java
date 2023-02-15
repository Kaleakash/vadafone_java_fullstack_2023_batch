package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeService {

	EmployeeDao ed = new EmployeeDao();
	
	public String storeEmployee(Employee emp) {
		
		if(emp.getSalary()>0) {
				
				if(ed.storeEmployee(emp)>0) {
					return "Record insered in database";
				}else {
					return "Record didn't insert";
				}
				
		}else {
			return "Salary must be >12000";
		}
	}
	
	public String updateEmployee(Employee emp) {				// emp id as 1, salary = 20000;
		float employeeOldSalary = ed.getEmployeeSalary(emp.getId());
		
		if(employeeOldSalary==0) {
			return "Employee record not present";
		
		}else if(emp.getSalary()>employeeOldSalary) {
		
			if(ed.updateEmployee(emp)>0) {
				return "Record updated successfully";
			}else {
				return "Record not updated";
			}
			
		}else {
			return "New Salary must be > Old Salary";
		}
		
	}
	
	public String deleteEmployeeRecord(int id) {
		if(ed.deleteEmployee(id)>0) {
			return "Record deleted successfully";
		}else {
			return "Record not present";
		}
	}
	
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = ed.findAllEmployee();
		Iterator<Employee> li = listOfEmp.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			emp.setSalary(emp.getSalary()+2000);
		}
		
        return listOfEmp;
        
      //return ed.findAllEmployee();
	}
	
}

package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.Employee;

public class EmployeeDao {

	public int storeEmployee(Employee emp) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
pstmt.setInt(1, emp.getId());
pstmt.setString(2, emp.getName());
pstmt.setFloat(3, emp.getSalary());
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	
	public int updateEmployee(Employee emp) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
pstmt.setFloat(1, emp.getSalary());
pstmt.setInt(2, emp.getId());
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	
	public int deleteEmployee(int id) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
pstmt.setInt(1, id);
int res = pstmt.executeUpdate();
return res;
		} catch (Exception e) {
		System.err.println(e);
		return 0;
		}
	}
	
	public float getEmployeeSalary(int id) {
		try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
PreparedStatement pstmt = con.prepareStatement("select salary from employee where id =?");
pstmt.setInt(1, id);
ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			float salary = rs.getFloat(1);
			return salary;
		}
		} catch (Exception e) {
		System.err.println(e);
		}
		return 0;
	}
	
	public List<Employee> findAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = 
         DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
          PreparedStatement pstmt = con.prepareStatement("select * from employee");

        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {		// we need to write the code to convert each record into java bean object. 
        	Employee emp = new Employee();
        	emp.setId(rs.getInt(1));
        	emp.setName(rs.getString(2));
        	emp.setSalary(rs.getFloat(3));			// converted each record into object 
        	
        	listOfEmp.add(emp);					// that object stored in arraylist
        }
		} catch (Exception e) {
		System.err.println(e);
		}
		return listOfEmp;
	}
	
}

package com;
import java.sql.*;
public class DemoTest {

	public static void main(String[] args) {
		try {
//		//Class.forName("com.mysql.jdbc.Driver");		// MySQL 5.x 
//		Class.forName("com.mysql.cj.jdbc.Driver");		// MySQL 8.x 
//		System.out.println("Driver loaded successfully");
//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
//	System.out.println("database connected successfully");
//	Statement stmt = con.createStatement();
//	ResultSet rs = stmt.executeQuery("select * from employee");
//	while(rs.next()) {
//		System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//	}
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
		Statement stmt = con.createStatement();
		
		
//		System.out.println("Retrieve all employee records one by one");
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
		
		System.out.println("Retrieve employee record with condition ");
		//ResultSet rs = stmt.executeQuery("select * from employee where salary > 30000");
		//ResultSet rs = stmt.executeQuery("select * from employee where name ='Raj' ");
		ResultSet rs = stmt.executeQuery("select * from employee where id in(4,5) ");
		while(rs.next()) {
			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		}
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

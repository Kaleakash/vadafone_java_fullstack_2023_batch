package com;
import java.sql.*;
import java.util.Scanner;
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
			
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
//	Statement stmt = con.createStatement();
	
//		System.out.println("Retrieve all employee records one by one");
//		ResultSet rs = stmt.executeQuery("select * from employee");
//		while(rs.next()) {
//			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
//		System.out.println("Retrieve employee record with condition ");
//		//ResultSet rs = stmt.executeQuery("select * from employee where salary > 30000");
//		//ResultSet rs = stmt.executeQuery("select * from employee where name ='Raj' ");
//		ResultSet rs = stmt.executeQuery("select * from employee where id in(4,5) ");
//		while(rs.next()) {
//			System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//		}
		
//		System.out.println("Insert Query");
//		
//		int temp = stmt.executeUpdate("insert into employee values(7,'Neena',18000)");
//		if(temp>0) {
//			System.out.println("record inserted successfully");
//		}
		
	
//		System.out.println("delete Query");
//	
//		int temp = stmt.executeUpdate("delete from employee where salary > 30000");
//		System.out.println(" number of records deleted "+temp);
//		if(temp>0) {
//			System.out.println("record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
	
//	System.out.println("update Query");
//				
//	int temp = stmt.executeUpdate("update employee set salary = 28000 where id=1");
//	System.out.println(" number of records updated "+temp);
//	if(temp>0) {
//		System.out.println("record updated successfully");
//	}else {
//		System.out.println("Record not present");
//	}
		Scanner sc = new Scanner(System.in);	
		System.out.println("Using PreparedStatement ");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root@123");
		//Statement stmt = con.createStatement();
//		System.out.println("insert query");
//		PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");
//		System.out.println("Enter the id");
//		int id = sc.nextInt();
//			pstmt.setInt(1, id);
//		System.out.println("Enter the name");
//		String name = sc.next();
//			pstmt.setString(2, name);
//		System.out.println("Enter the salary");
//		float salary = sc.nextFloat();
//			pstmt.setFloat(3, salary);
//		int temp = pstmt.executeUpdate();
//		if(temp>0) {
//			System.out.println("Record insered successfully");
//		}
//		System.out.println("Delete query");
//		PreparedStatement pstmt = con.prepareStatement("delete from employee where id =?");
//		System.out.println("Plz enter the id to delete the record");
//		int id = sc.nextInt();
//			pstmt.setInt(1, id);
//		int temp = pstmt.executeUpdate();
//		if(temp>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
		System.out.println("Update query");
	PreparedStatement pstmt = con.prepareStatement("update employee set salary = ? where id = ?");
		System.out.println("Plz enter the id to update salary");
		int id = sc.nextInt();
		System.out.println("Plz enter the new salary");
		float salary = sc.nextFloat();
			pstmt.setInt(2, id);
			pstmt.setFloat(1, salary);
			
		int temp = pstmt.executeUpdate();
		if(temp>0) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Record not present");
		}
		
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}

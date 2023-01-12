package com;

import java.util.Scanner;

//import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = sc.nextInt();			// scan integer number and store in id value 
	System.out.println("Enter the name");
	String name = sc.next();    // scan the name 
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);

	}

}

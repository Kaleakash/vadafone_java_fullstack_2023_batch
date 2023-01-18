package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
	
//		Employee emp = new Employee(100, "John", 25000);
//		emp.display();
//		FileOutputStream fos = new FileOutputStream("employee.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp);
//		System.out.println("Object serialization done successfully");
		
		FileInputStream fis = new FileInputStream("employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Employee emp1 = (Employee)obj;
		emp1.display();
		System.out.println("object de-serialization");
	}

}

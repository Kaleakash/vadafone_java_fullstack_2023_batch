package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StoringPrimitiveData {

	public static void main(String[] args) throws Exception{
//		int id =100;
//		String name = "Ravi";
//		float salary = 12000;
//		boolean res = true;
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeInt(id);
//		dos.writeUTF(name);
//		dos.writeFloat(salary);
//		dos.writeBoolean(res);
//		System.out.println("Employee data stored");
		FileInputStream fis  = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);
		System.out.println("id is "+dis.readInt());
		System.out.println("Name is "+dis.readUTF());
		System.out.println("Salary is "+dis.readFloat());
		System.out.println("result is "+dis.readBoolean());

	}

}

package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ByteWiseOperation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// source : keyboard 
		// destination : console or monitor 
//		DataInputStream dis = new DataInputStream(System.in);
//		PrintStream ps = System.out;
//		ps.println("Enter the name");
//		String name  = dis.readLine();
//		ps.println("Name is "+name);
		
		// soure :keyboard 
		// destination : file 
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("Enter the data");
		int ch;
		while((ch = dis.read()) != '\n') {
			fos.write(ch);
		}
		System.out.println("done!");
	}

}

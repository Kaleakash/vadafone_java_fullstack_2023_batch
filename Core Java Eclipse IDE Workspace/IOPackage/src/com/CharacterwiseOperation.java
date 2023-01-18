package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CharacterwiseOperation {

	public static void main(String[] args) throws Exception{
// Source : Keyboard 
// Destination : Console 
	//InputStreamReader isr = new InputStreamReader(System.in);
	//BufferedReader br = new BufferedReader(isr);
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//	String name = br.readLine();
//	System.out.println("Enter the id");
//	int id = Integer.parseInt(br.readLine());  
//	
//	System.out.println("Your name is "+name);
//	System.out.println("Id is "+id);
	
		// source : keyboard 
	// destination : file 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the data");
//		FileWriter fw = new FileWriter("info.txt");
//		int ch;
//		while((ch=br.read()) != '@') {
//			fw.write(ch);
//		}
//		fw.flush();  // send the data from buffer memeory to file 
//		System.out.println("data stored in file ");
		
		// source : file 
		// destination :file 
//		FileReader fr  = new FileReader("C:\\Users\\akash\\Desktop\\abcd.txt");
//		FileWriter fw = new FileWriter("abab.txt");
//		int ch;
//		while((ch = fr.read()) != -1) {
//			fw.wr
//			fw.write(ch);
//		}
//		fw.flush();
//		System.out.println("file copied...");
		
		// read and write word wise 
		FileReader fr  = new FileReader("C:\\Users\\akash\\Desktop\\abcd.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("ababab.txt");
		String info;
		do {
			info= br.readLine();
			System.out.println(info);
			fw.write(info);
		}while(info.equals(null));
		fw.flush();
		System.out.println("file copied...");
	}


}

package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CreatingNewFile {

	public static void main(String[] args) throws Exception{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz enter the file name which you want to create");
		String fileName = sc.next();
		String filePath = "C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\all files\\"+fileName;
		File ff = new File(fileName);
		if(ff.exists()) {
			System.out.println("File already present");
		}else {
				//ff.createNewFile();
			FileWriter fw = new FileWriter(filePath);
			fw.write("Welcome user your create file with name as "+fileName);
			fw.flush();
			//System.out.println(ff.createNewFile());
			System.out.println("File created...");
		}
	}

}

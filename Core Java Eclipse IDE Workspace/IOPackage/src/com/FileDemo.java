package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		File ff = new File("C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\all files");
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isFile());
		File ff1 = new File("C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\all files\\a.txt");
		System.out.println(ff1.isFile());
		File ff2 = new File("C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\all files\\a1.txt");
		System.out.println(ff2.isFile());
		System.out.println(ff2.exists());
			//ff.cre
		System.out.println(ff1.exists());
		String ss[]=ff.list();
		System.out.println(ss.length);
		for(String s :ss) {
			System.out.println(s);
		}
		
		File ff3 = new File("C:\\Users\\akash\\Desktop\\vadafone_java_fullstack_2023_batch\\all files\\b.txt");
		System.out.println(ff3.canRead());
		System.out.println(ff3.canWrite());
		
	}

}

package com;

public class StringExample {

	public static void main(String[] args) {
	String str1 = "Welcome to Java Training";
	String str2 =new String("Welcome to Java Training");
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str1.length());
	System.out.println(str1.toUpperCase());
	System.out.println(str1.toLowerCase());
	System.out.println(str1.substring(4));
	System.out.println(str1.substring(4, 10));
	System.out.println(str1.indexOf('e'));
	System.out.println(str1.startsWith("W"));
	System.out.println(str1.endsWith("o"));
	System.out.println(str1.contains("Java"));

	}

}

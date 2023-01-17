package com;

public class StringExample {

	public static void main(String[] args) {
//	String str1 = "Welcome to Java Training";
//	String str2 =new String("Welcome to Java Training");
//	System.out.println(str1);
//	System.out.println(str2);
//	System.out.println(str1.length());
//	System.out.println(str1.toUpperCase());
//	System.out.println(str1.toLowerCase());
//	System.out.println(str1.substring(4));
//	System.out.println(str1.substring(4, 10));
//	System.out.println(str1.indexOf('e'));
//	System.out.println(str1.startsWith("W"));
//	System.out.println(str1.endsWith("o"));
//	System.out.println(str1.contains("Java"));
//		String name1 = "Raj";
//		String name2 = "Raj";
//		String name3 = new String("Raj");
//		String name4 = new String("Raj");
//	
//	if(name3.equals(name4)) {
//		System.out.println("Equal");
//	}else {
//		System.out.println("Not Equal");
//	}
//	
//		String name ="Raj";
//		System.out.println(name);
//		System.out.println(name.toUpperCase());
//		System.out.println(name.substring(1));
//		System.out.println(name);
//		name = name+" Deep";
//		System.out.println(name);
		StringBuffer sb = new StringBuffer("Raj");
		System.out.println(sb);
		System.out.println(sb.append(" Deep"));
		System.out.println(sb);
		sb.delete(1, 2);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}

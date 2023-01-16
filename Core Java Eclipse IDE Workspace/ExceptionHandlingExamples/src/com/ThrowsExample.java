package com;

public class ThrowsExample {

	static void dis1() throws Exception {
		//try {
		int a=10/0;
		//}catch(Exception e) {}
		System.out.println("dis1 method");
	}
	static void dis2() throws Exception{
		//try {
		dis1();
		//}catch(Exception e) {}
		System.out.println("dis2 method");
	}
	public static void main(String[] args) throws Exception{
			//try {
			dis2();
			//}catch(Exception e) {}
			System.out.println("main method");
	}

}

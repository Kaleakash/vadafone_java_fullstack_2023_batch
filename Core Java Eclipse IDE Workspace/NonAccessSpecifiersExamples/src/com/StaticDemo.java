package com;
class Abc {
	int a;				// instance variable 
	static int b;		// static variable 
	void dis1() {
		System.out.println("Non static method or instance method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void dis2() {
		System.out.println("static method");
		Abc obj = new Abc();
		System.out.println("a "+obj.a);
		System.out.println("b "+b);
	}
	
}
public class StaticDemo {
	public static void main(String[] args) {
//		Abc obj1 = new Abc();
//		obj1.dis1();
//		
		Abc.dis2();  // calling through class name 
//		obj1.dis2();   // calling through object 
//		
//		obj1.a=100;
		
//		Abc.b=200;  // static variable 
//		obj1.b=300;  // static variable 
	}
}

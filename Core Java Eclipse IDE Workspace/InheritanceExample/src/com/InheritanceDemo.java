package com;
class A {					// super class or base class or parent class 
	void dis1() {
		System.out.println("A class dis1 method");
	}
}
class B extends A{			// sub class or derived class or child class 
	void dis2() {
		System.out.println("B class dis2 method");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		A obj1 =new A();
		obj1.dis1();
		
		B obj2 = new B();
		obj2.dis2();
		obj2.dis1();
	}

}

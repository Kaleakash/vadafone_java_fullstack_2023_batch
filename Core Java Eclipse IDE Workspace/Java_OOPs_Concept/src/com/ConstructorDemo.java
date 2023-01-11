package com;

class Sample {

	Sample() {
		System.out.println("object created...");
	}
	void display() {
		System.out.println("this is display method part of sample class");
	}
	String sayHello() {
		return "Welcome user ";
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Sample s1= new Sample();
		//s1.display();
	}

}

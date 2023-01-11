package com;

public class Car {
	int wheel;
	String color;
	float price;			// instance variable 
	
	void start() {
		System.out.println("Cart Started...");
	}
	void appliedGear() {
		System.out.println("Applied Gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car Stop");
	}
	
	void displayCarDetails() {
		String info="Car Info";			// local variable 
		System.out.println("Wheel "+wheel);
		System.out.println("Color "+color);
		System.out.println("Price "+price);
		System.out.println(info);
	}
}


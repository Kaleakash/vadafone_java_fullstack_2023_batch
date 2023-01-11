package com;

public class CarTest {

	public static void main(String[] args) {
//		Car innova = new Car();		// heap memory 
//		innova.start();
//		innova.stop();
//		
//		Car bmw = new Car();
//		bmw.start();
//		bmw.stop();
		
		Car innova  = new Car();
		//innova.displayCarDetails();
		innova.wheel=4;
		innova.color="Gray";
		innova.price=3200000;
		innova.displayCarDetails();
	}

}

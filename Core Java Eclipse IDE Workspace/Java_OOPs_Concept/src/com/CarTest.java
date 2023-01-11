package com;

public class CarTest {

	public static void main(String[] args) {
		Car innova = new Car();		// heap memory 
		innova.start();
		innova.stop();
		
		Car bmw = new Car();
		bmw.start();
		bmw.stop();
	}

}

package com;

import java.util.Scanner;

public class Address {
	private String city;
	private String state;
	Scanner sc =new Scanner(System.in);
	void readAdd() {
		System.out.println("Enter the city");
		city = sc.next();
		System.out.println("Enter the state");
		state = sc.next();
	}
	void disAdd() {
		System.out.println("City is "+city);
		System.out.println("State is "+state);
	}
}

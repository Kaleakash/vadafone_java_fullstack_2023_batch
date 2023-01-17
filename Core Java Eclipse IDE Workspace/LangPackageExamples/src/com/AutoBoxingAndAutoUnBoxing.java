package com;

public class AutoBoxingAndAutoUnBoxing {

	public static void main(String[] args) {
		int a=10;
		//Integer b = new Integer(a);
		Integer b =a;    // auto boxing : converting primitive object. 
		
		Integer c = 100; // auto boxing : converting primitive object 
		
		
		//int d = c.intValue();
		int d = c;		// auto unboxing : converting object to primitive s
	}

}

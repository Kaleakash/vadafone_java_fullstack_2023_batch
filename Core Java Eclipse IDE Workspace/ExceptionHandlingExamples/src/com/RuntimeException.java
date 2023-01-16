package com;

public class RuntimeException {

	public static void main(String[] args) {
	
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]= {10,20,30,40};
			try {
					int result1 = a/b;
					System.out.println("Result is "+result1);
					int result2 = abc[1]/10;
					System.out.println("Result is "+result2);
			}catch(Exception e) {
				//System.out.println("I Take Care!");
				//System.out.println(e.getMessage());  // short execption message 
				System.out.println(e.toString()); // name of exception 
			}
	System.out.println("Bye....");
	System.out.println("Bye....");
	System.out.println("Bye....");
	
	}

}

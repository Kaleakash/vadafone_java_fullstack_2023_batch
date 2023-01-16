package com;

import java.util.Scanner;

class VoteException extends Exception {
	public VoteException() {
	
	}
	public VoteException(String msg) {
		super(msg);    // passing this message to Exception super class parameterized constructor to set the value. 
	}
}
public class ThrowsKeywordExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
				
		int age=sc.nextInt();
		try {
		if(age>=18) {
			System.out.println("You can Vote!");
		}else {
			//throw new Exception();  // throw generic exception 
			//throw new Exception("age must be >= 21"); // name of the exception with message 
			//throw new ArithmeticException();  // throw specific 
			//throw new ArithmeticException("age must be >=21");
			//throw new VoteException();
			throw new VoteException("age must be be >=21");
			//throw null;
		}
		}catch(Exception e) {
			//System.out.println(e.toString());
		}

	}

}

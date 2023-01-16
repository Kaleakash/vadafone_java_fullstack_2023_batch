package com;

public class TryAndFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int res = 100/0;
			System.out.println("No Exception");
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("Normal statement");

	}

}

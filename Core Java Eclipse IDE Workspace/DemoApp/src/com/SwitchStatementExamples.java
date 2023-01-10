package com;

public class SwitchStatementExamples {

	public static void main(String[] args) {
		int choice = 3;
		switch(choice) {
		case 1:System.out.println("Block 1");
				break;
		case 2:System.out.println("Block 2");
				break;
		case 3:System.out.println("Block 3");
				break;
		default:System.out.println("wrong block");
		         break;
		}

		System.out.println("Finish");
	}

}

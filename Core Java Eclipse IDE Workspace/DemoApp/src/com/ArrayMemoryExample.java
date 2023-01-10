package com;

public class ArrayMemoryExample {

	public static void main(String[] args) {
		int num[]=new int[10];		// num can hold 10 value start from 0 to 9
		int temp=100;
		System.out.println("Assign the value ");
		for(int i=0;i<num.length;i++) {
			num[i]=temp++;
		}
		System.out.println("display the value");	
		for(int n:num) {
			System.out.println(n);
		}

	}

}

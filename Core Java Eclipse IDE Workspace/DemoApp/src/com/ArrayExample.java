package com;

public class ArrayExample {

	public static void main(String[] args) {
		int abc[];	
		int xyz[]= {10,20,30,40,50,100,220,34,56,78,88,45,32,34};
		System.out.println(xyz);
		System.out.println(xyz[0]);
		System.out.println(xyz[4]);
		//System.out.println(xyz[5]);
		System.out.println("size "+xyz.length);
		System.out.println("retrieve elements using for loop");
		for(int i=2;i<8;i=i+2) {
			System.out.println(xyz[i]);
		}
		System.out.println("retreive elements using each loop ");
		for(int i:xyz) {
			System.out.println(i);
		}
	}

}

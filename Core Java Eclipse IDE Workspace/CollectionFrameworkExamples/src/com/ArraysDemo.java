package com;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int num[]= {3,1,6,9,4,2};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		Arrays.sort(num);  // sorting by default asc 
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Search ");
		//System.out.println("Search element "+Arrays.binarySearch(num, 6));
		//System.out.println("Search element "+Arrays.binarySearch(num, 10));
		if(Arrays.binarySearch(num, 10)<0) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element present");
		}
	}

}

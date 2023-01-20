package com;

import java.util.Scanner;

public class SearchingExample {
	public static int linearSearch(int num[], int key) {
			
		for(int i=0;i<num.length;i++) {
			if(num[i]==key) {
				return 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int num[]= {1,5,2,4,9,8,7};
		System.out.println("Plz enter the element to search from array");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int result = linearSearch(num, key);
		if(result==1) {
			System.out.println("Element  present");
		}else {
			System.out.println("Element not present");
		}
	}

}

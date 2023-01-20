package com;

import java.util.Arrays;
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
	public static void binarySearch(int num[], int first, int last, int key) {
		int mid = (first+last)/2;			// mid =0+6, mid = 3 key = 5 num[3]
		while(first <= last) {
			if(num[mid]<key) {
				first  = mid+1;
			}else if(num[mid]==key) {
				System.out.println("Element present");
				break;
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not present");
		}
	}
	public static void main(String[] args) {
		int num[]= {1,5,2,4,9,8,7};
		System.out.println("Plz enter the element to search from array");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		Arrays.sort(num);	// 1,2,4,5,7,8,9		 pre defined sorting technique 
		binarySearch(num, 0, num.length-1, key);
		
//		int result = linearSearch(num, key);
//		if(result==1) {
//			System.out.println("Element  present");
//		}else {
//			System.out.println("Element not present");
//		}
	}

}

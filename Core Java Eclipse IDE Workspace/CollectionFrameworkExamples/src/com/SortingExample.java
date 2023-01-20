package com;

public class SortingExample {

	public static void selectionSortAsc(int num[],int size) {
		for(int i=0;i<size;i++) {			//size 7, min=0,	1 < 4 
			int min =i;
			for(int j=i+1;j<size;j++) {
				if(num[j]<num[min]) {
					min=j;
				}
			}
			int temp =num[i];
			num[i]=num[min];
			num[min]=temp;
		}
	}
	public static void selectionSortDesc(int num[],int size) {
		for(int i=0;i<size;i++) {			//size 7, min=0,	1 < 4 
			int max =i;
			for(int j=i+1;j<size;j++) {
				if(num[j]>num[max]) {
					max=j;
				}
			}
			int temp =num[i];
			num[i]=num[max];
			num[max]=temp;
		}
	}
	public static void bubbleSortAsc(int num[],int size) {
		for(int i=0;i<size;i++) {			//size 7, min=0,	1 < 4 
			for(int j=0;j<size-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp =num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}

		}
	}
	public static void bubbleSortDesc(int num[],int size) {
		for(int i=0;i<size;i++) {			//size 7, min=0,	1 < 4 
			for(int j=0;j<size-1-i;j++) {
				if(num[j]<num[j+1]) {
					int temp =num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}

		}
	}
	public static void main(String[] args) {
		int num[]= {4,1,8,9,3,2,6};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		//selectionSortAsc(num, num.length);
		//selectionSortDesc(num, num.length);
		//bubbleSortAsc(num, num.length);
		bubbleSortDesc(num, num.length);
		System.out.println();
		System.out.println("AFter sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
	}

}

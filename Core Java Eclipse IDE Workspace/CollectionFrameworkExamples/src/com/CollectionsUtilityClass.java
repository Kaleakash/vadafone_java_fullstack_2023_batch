package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass {

	public static void main(String[] args) {
		List<String> listOfStd = new ArrayList<String>();
		listOfStd.add("Lex"); listOfStd.add("Steven"); listOfStd.add("John"); listOfStd.add("Raj"); listOfStd.add("Leena");
		listOfStd.add("Ajay");
		System.out.println("Before sort");
		for(String name:listOfStd) {
			System.out.print(name+" ");
		}
		Collections.sort(listOfStd);
			System.out.println();
		System.out.println("After sort - Asc");
		for(String name:listOfStd) {
			System.out.print(name+" ");
		}
		Collections.reverse(listOfStd);
			System.out.println();
		System.out.println("After sort - Desc");
		for(String name:listOfStd) {
			System.out.print(name+" ");
		}
	}

}

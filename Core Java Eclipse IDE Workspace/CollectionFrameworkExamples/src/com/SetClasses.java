package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClasses {

	public static void main(String[] args) {
		// HashSet : HashSet doen't maintain order 
//		Set ss1 = new HashSet();
//		System.out.println("Size "+ss1.size());
//		ss1.add(10);
//		ss1.add(40);
//		ss1.add(30);
//		ss1.add(60);
//		ss1.add(50);
//		System.out.println(ss1);
//		System.out.println("Size "+ss1.size());
//		System.out.println("Search "+ss1.contains(50));
//		System.out.println("Search "+ss1.contains(100));
//		ss1.remove(40); // we can remove using value but not using index 
//		System.out.println(ss1);
//		ss1.clear();
//		System.out.println(ss1);
		
		// LinkedHashSet : it maintain the order 
		
//		Set ss1 = new LinkedHashSet();
//		System.out.println("Size "+ss1.size());
//		ss1.add(10);
//		ss1.add(40);
//		ss1.add(30);
//		ss1.add(60);
//		ss1.add(50);
//		System.out.println(ss1);
//		System.out.println("Size "+ss1.size());
//		System.out.println("Search "+ss1.contains(50));
//		System.out.println("Search "+ss1.contains(100));
//		ss1.remove(40); // we can remove using value but not using index 
//		System.out.println(ss1);
//		ss1.clear();
//		System.out.println(ss1);
		
		//TreeSet : Maintain the order 
		// In TreeSet we need to store same data type values. 
		TreeSet ss1 = new TreeSet();
//		System.out.println("Size "+ss1.size());
//		ss1.add(10);
//		ss1.add(40);
//		ss1.add(40);
//		ss1.add(30);
//		//ss1.add(10.20);
//		ss1.add(60);
//		ss1.add(50);
//		System.out.println(ss1);
//		System.out.println("Size "+ss1.size());
//		System.out.println("Search "+ss1.contains(50));
//		System.out.println("Search "+ss1.contains(100));
//		System.out.println(ss1);
//		ss1.remove(40); // we can remove using value but not using index 
//		System.out.println(ss1);
//		System.out.println(ss1.headSet(30));
//		System.out.println(ss1.tailSet(30));
//		//ss1.clear();
//		System.out.println(ss1);
		ss1.add(3);
		ss1.add(1);
		ss1.add(6);
		ss1.add(4);
		ss1.add(7);
		ss1.add(5);
		System.out.println(ss1);
		System.out.println(ss1.headSet(4));
		System.out.println(ss1.tailSet(4));
	}

}

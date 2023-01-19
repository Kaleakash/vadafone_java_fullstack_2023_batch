package com;

import java.util.ArrayList;
class A {}
class B {}
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList al = new ArrayList();
//		System.out.println("Size "+al.size());
//		al.add(10);// before storing 10 is primitive but after stored 10 become Object class reference 
//		al.add(10.10);	// auto-boxing : converting primitive to Object 
//		al.add("Ravi");
//		al.add(true);
//		A obj1 = new A();
//		al.add(obj1);
//		B obj2 = new B();
//		al.add(obj2);
//		System.out.println("Size "+al.size());
//		System.out.println(al);
		
		ArrayList al = new ArrayList<>();
		System.out.println("size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(10);
		al.add(30);
		al.add(20);
		al.add(50);
		al.add(60);
		System.out.println(al);
		System.out.println("size "+al.size());
		System.out.println("Empty "+al.isEmpty());
		System.out.println("get value using index "+al.get(1));
		al.add(1,100);
		System.out.println("get value using index "+al.get(1));
		System.out.println(al);
		al.remove(2); // remove using index position 
		Integer n = 50;
		al.remove(n);	// remove using value 
		System.out.println(al);
		System.out.println("Search "+al.contains(10));
		System.out.println("search "+al.contains(1000));
			al.clear();	// remove all 
		
		System.out.println("Size "+al.size());
		
	}

}

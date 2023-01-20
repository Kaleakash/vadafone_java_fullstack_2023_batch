package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveValuesFromCollections {

	public static void main(String[] args) {
		// Retrieve the value from HashSet, TreeSet, LinkedHashSet 
//		Set ss = new HashSet();
//		ss.add(10);		// auto boxing : converting primitive to object 
//		ss.add(20.30);
//		ss.add(true);
//		ss.add("John");
//		ss.add('%');
//		System.out.println(ss); // display the output in string format 
//		System.out.println("Retrieve the data usng for each loop or enhanced loop");
//		for(Object a:ss) {
//			System.out.println(a);
//		}
//		System.out.println("Using iterator");
//		Iterator ii= ss.iterator();
//		while(ii.hasNext()) {
//			System.out.println(ii.next());
//			//ii.remove();
//		}
		
		// List ArrayList and LinkedList 
//		List ll = new ArrayList();
//		ll.add(3);
//		ll.add(7);
//		ll.add(5);
//		ll.add(2);
//		ll.add(9);
//		System.out.println("For each loop");
//		for(Object obj : ll) {
//			System.out.println(obj);
//		}
//		System.out.println("Retrieve the value using ListIterator - forward direction");
//		ListIterator li = ll.listIterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		System.out.println("Retrieve the value using ListIterator - backward direction");
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
		// Retrieve the elements from Map 
		Map mm = new HashMap();
		mm.put(1, "Steven");
		mm.put(2, "Lex");
		mm.put(3,"John");
		System.out.println("Value "+mm.get(100));
		System.out.println("Value "+mm.get(1));
//		for(Object obj : mm) {
//			
//		}
					//mm.keySet();	extracting only keys from map and convert to set. 
					//mm.entrySet();converting complete map to set 
		Set ss = mm.keySet();		// extracting only keys from map and convert to set. 
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println("Keys are "+obj+" Value is "+mm.get(obj));
		}
		
	}

}

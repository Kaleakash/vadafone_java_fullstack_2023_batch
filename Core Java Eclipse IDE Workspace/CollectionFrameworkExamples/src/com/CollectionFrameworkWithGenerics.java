package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionFrameworkWithGenerics {

	public static void main(String[] args) {
		// collection framework without generics 
//		List ll = new ArrayList();
//		ll.add(10);			// after stored they converted into Object 
//		ll.add(10.10);
//		ll.add("Lex");
//		
//		Object obj = ll.get(2);
//		Integer i = (Integer)obj;
//		int n = i.intValue();
//		System.out.println(n);
		
		// collection framework with generics 
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		//ll.add(30.30);
		
		int n = ll.get(0);  // auto-unboxing : conveting object to primitive 
		System.out.println(n);
		
		Iterator<Integer> li = ll.iterator();
		while(li.hasNext()) {
			int m = li.next();
			System.out.println(m);
		}
		
		Map<Integer, String> mm =new HashMap<>();
		mm.put(1, "John");
		//mm.put("Abc", 100)
	}

}

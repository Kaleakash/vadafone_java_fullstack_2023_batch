package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {

	public static void main(String[] args) {
		// HashMap :key is unique and value can be duplicate 
//		Map mm = new HashMap();
//		mm.put(2,"Lex");
//		mm.put(1, "Leena");
//		mm.put(3, "Raj");
//		mm.put(5, "Steven");
//		mm.put(1, "Teena");		// with same key if we store the old value replace by new value 
//		mm.put(7,"Lex");
//		mm.put(8, null);
//		mm.put(null, "Mahesh");
//		mm.put(null,null);
//		mm.put("a", "b");
//		System.out.println(mm);
//		System.out.println(mm.containsKey(1));
//		System.out.println(mm.containsKey(100));
		
		// LinkedHashMap
		
//		Map mm = new LinkedHashMap();
//		mm.put(2,"Lex");
//		mm.put(1, "Leena");
//		mm.put(3, "Raj");
//		mm.put(5, "Steven");
//		mm.put(1, "Teena");		// with same key if we store the old value replace by new value 
//		mm.put(7,"Lex");
//		mm.put(8, null);
//		mm.put(null, "Mahesh");
//		mm.put(null,null);
//		mm.put("a", "b");
//		System.out.println(mm);
//		System.out.println(mm.containsKey(1));
//		System.out.println(mm.containsKey(100));
		
		// TreeMap : Display the key in asc order 
		// in TreeMap key must same type . In TreeMap we can't store null key. 
//		Map mm = new TreeMap();
//		mm.put(2,"Lex");
//		mm.put(1, "Leena");
//		mm.put(3, "Raj");
//		mm.put(5, "Steven");
//		mm.put(1, "Teena");		// with same key if we store the old value replace by new value 
//		mm.put(7,"Lex");
//		mm.put(8, null);
//	//	mm.put(null, "Mahesh");		// error 
////		mm.put(null,null);			// error 
//	//	mm.put("a", "b");		// error 
//		System.out.println(mm);
//		System.out.println(mm.containsKey(1));
//		System.out.println(mm.containsKey(100));
		
		// Hashtable : all method are synchronized 
		// doesn't allow null key as well as null value 
		Map mm = new Hashtable();
		mm.put(2,"Lex");
		mm.put(1, "Leena");
		mm.put(3, "Raj");
		mm.put(5, "Steven");
		mm.put(1, "Teena");		// with same key if we store the old value replace by new value 
		mm.put(7,"Lex");
		//mm.put(8, null);
		//mm.put(null, "Mahesh");		// error 
//		mm.put(null,null);			// error 
		mm.put("a", "b");		// error 
		System.out.println(mm);
		System.out.println(mm.containsKey(1));
		System.out.println(mm.containsKey(100));
	}

}

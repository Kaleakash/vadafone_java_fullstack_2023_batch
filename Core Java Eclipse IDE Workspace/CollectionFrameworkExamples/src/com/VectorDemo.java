package com;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	Vector vv = new Vector();
	vv.add(10);
	vv.add(20);
	vv.add(30);
	vv.add(40);
	System.out.println(vv);
	System.out.println("Size "+vv.size());
	System.out.println(vv.contains(100));
	System.out.println(vv.contains(10));
	}

}

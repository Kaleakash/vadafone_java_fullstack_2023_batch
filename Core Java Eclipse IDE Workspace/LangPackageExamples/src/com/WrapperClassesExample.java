package com;

public class WrapperClassesExample {

	public static void main(String[] args) {
		int a=10;
		Integer b = new Integer(a);
		System.out.println(a);
		System.out.println(b);
		//System.out.println(b.);
		int c = b.intValue();
		float d = b.floatValue();
		System.out.println(c);
		System.out.println(d);
		
		String e="10";
		String f = "20";
		System.out.println(e+f);
		int g = Integer.parseInt(e);  // converting string to integer 
		int i = Integer.parseInt(f);
		System.out.println(g+i);
		String j = String.valueOf(g);	// converting int to string 
		String k = String.valueOf(i);
		System.out.println(j+k);
	}

}

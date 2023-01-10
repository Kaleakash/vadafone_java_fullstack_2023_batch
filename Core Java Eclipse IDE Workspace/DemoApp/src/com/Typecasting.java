package com;

public class Typecasting {

	public static void main(String[] args) {
	byte a=100;
	short b=a;		// implicit type casting 
	System.out.println(a);
	System.out.println(b);
	
	short c=129;
	// datType variableName = (type)variableName;
	byte d = (byte)c;		// explicit type casting 
	System.out.println(c);
	System.out.println(d);
	
	int m=100;
	float n =m;			// implicit 
	System.out.println(m);
	System.out.println(n);
	
	float o =100;
	int p = (int)o;		// explicit 
	System.out.println(o);
	System.out.println(p);
	
	}

}

package com;

public class TryWithMultileCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int num[]= {0,20,30,40};
		String abc="10";
		try {
			int res =100/num[2];			// num[0], num[5], num[2]
			System.out.println("res "+res);
			System.out.println(abc+10);
				System.out.println(Integer.parseInt(abc)+10);
			//System.out.println("No Exception");
		}catch (ArithmeticException e) {
			System.out.println("Divided by Zero "+e.toString());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index "+e.toString());
		}catch(Exception e) {
			System.out.println("Generic "+e.toString());
		}
		System.out.println("finish");
	}

}

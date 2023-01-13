package com;
final class A {
	final void dis1() {
		System.out.println("A class method");
	}
}
//class B extends A{
////	@Override
////	void dis1() {
////		System.out.println("B class method override");
////	}
//}
public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int A=100;
		System.out.println(A);
		//A=200;
		System.out.println(A);
//		B obj1 = new B();
//		obj1.dis1();
		A obj2 = new A();
		obj2.dis1();
	}

}

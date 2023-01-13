package com;
interface Abc {
	int A=10;
	void dis1();
}
interface Xyz {
	int B=20;
	void dis2();
}
interface Mno extends Abc,Xyz{
	int C=30;
	void dis3();
}
class Test implements Abc,Xyz{
		public void dis1() {
			System.out.println("Abc interface dis1 method");
		}
		public void dis2() {
			System.out.println("Xyz interface dis2 method");
		}
}
public class DemoTest {
	public static void main(String[] args) {
		Test tt = new Test();	
		tt.dis1();
		tt.dis2();
	}

}

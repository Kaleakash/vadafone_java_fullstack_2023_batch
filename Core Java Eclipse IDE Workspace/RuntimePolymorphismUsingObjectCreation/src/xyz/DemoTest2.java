package xyz;
abstract class A {			// super class is a abstract class 
	abstract void dis1();
}
class B extends A {		// sub class 
	@Override
	void dis1() {
		System.out.println("A class method override by B class");
	}
	void dis2() {
		System.out.println("B class method - sub class");
	}
}
public class DemoTest2 {
	public static void main(String[] args) {
	//A obj1 = new A();     obj1.dis1();
	B obj2 = new B();	  obj2.dis1(); obj2.dis2();
	//B obj3 = new A();	// creating super class object and sub class reference not possible 
	A obj4 = new B();	// creating sub class object and super class reference it can be abstract class. 
							//possible run time polymorphism  
	obj4.dis1();			// obj4 we can call only those method which belong to super class 
	//obj4.dis2();				// or override methods. we can't call sub class own method. 
	}
}

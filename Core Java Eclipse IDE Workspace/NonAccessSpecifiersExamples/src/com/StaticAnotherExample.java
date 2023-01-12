package com;
class Info {
	int a;
	static int b;
	void dis() {
		int b;
		System.out.println("a "+this.a);
		System.out.println("b "+Info.b);
	}
}
public class StaticAnotherExample {
	static int b;
	public static void main(String[] args) {
		int a;
			Info obj1 = new Info();			// heap memory 
				Info obj2 = new Info();
					obj1.a=100;
						Info.b=200;
							obj1.b=300;
	
								obj2.a=400;
									Info.b=500;
										obj2.b=600;
	obj1.dis();				// a = 100, b=600
	obj2.dis();				// a = 400, b = 600
	}

}

package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Pulsar extends Bike {
	@Override							// overriding the method 
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Red");
	}
}
class Honda extends Bike {					// re-usability the method 
	void color() {
		System.out.println("Gray");
	}
}
class Tvs extends Bike {
	void color() {
		System.out.println("Black");
	}
	@Override							
	void speed() {
		super.speed();						// calling super class speed method
		System.out.println("20km/hr");			// super class and sub class code merge together 
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
	Pulsar pu = new Pulsar();		 pu.color();   pu.speed();		// 90km/hr
	Honda hh = new Honda();	         hh.color();   hh.speed();		// 60km/hr
	Tvs tv = new Tvs();				tv.color();   tv.speed();
	}

}

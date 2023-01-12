package com;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Pulsar extends Bike {
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
	void color() {
		System.out.println("Red");
	}
}
class Honda extends Bike {
	void color() {
		System.out.println("Gray");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
	Pulsar pu = new Pulsar();		 pu.color();   pu.speed();	
	Honda hh = new Honda();	         hh.color();   hh.speed();
	}

}

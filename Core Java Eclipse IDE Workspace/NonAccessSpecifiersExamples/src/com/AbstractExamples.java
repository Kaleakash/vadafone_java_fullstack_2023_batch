package com;


abstract class Bike {
	abstract void speed();
}
abstract class Pulsar extends Bike {
	abstract void mailage();
	void color() {
		System.out.println("Red");
	}
}
class SuperPulsar extends Pulsar {
	void speed() {
		System.out.println("120km/hr");
	}
	void mailage() {
		System.out.println("20km/lt");
	}
}
public class AbstractExamples {

	public static void main(String[] args) {
		
//Pulsar pu = new Pulsar();
		SuperPulsar sp  = new SuperPulsar();
		sp.color();
		sp.mailage();
		sp.speed();
	}

}

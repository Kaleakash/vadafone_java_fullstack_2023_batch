package com;
class Booking implements Runnable {
	int avl  = 1;
	
	@Override
	public  void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	
	System.out.println(name+" thread enter in run trying to book");
	try {
	Thread.sleep(500);
	}catch(Exception e) {}
	synchronized (this) {
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl=avl-1;
		}	else {
			System.out.println(name+" sorry no ticket");
		}
	}
	
	}
}
public class BookingApp {
	public static void main(String[] args) {
	Booking b1 = new Booking();			// avl=1
	//Booking b2 = new Booking();			// avl=1
	//Booking b3 = new Booking();			// avl=1
	//Booking b4 = new Booking();			// avl=1
	
	Thread t1 = new Thread(b1);
	Thread t2 = new Thread(b1);
	Thread t3 = new Thread(b1);
	Thread t4 = new Thread(b1);
	t1.setName("Raj");
	t2.setName("Steven");
	t3.setName("Neena");
	t4.setName("John");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	}

}

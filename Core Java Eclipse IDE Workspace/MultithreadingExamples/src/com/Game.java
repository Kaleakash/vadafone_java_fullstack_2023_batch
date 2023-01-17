package com;

class Car implements Runnable {
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	for(int i=0;i<=10;i++) {
		System.out.println(name+" is moving ");
		try {
		Thread.sleep(1000);
		}catch(Exception e) {}
	}
	}
}
public class Game {
	public static void main(String[] args) throws Exception{
	Car tt = new Car();
	Thread t1 = new Thread(tt);
	Thread t2 = new Thread(tt);
	Thread t3 = new Thread(tt);
	Thread t4 = new Thread(tt);
	t1.setName("Car1");
	t2.setName("Car2");
	t3.setName("Car3");
	t4.setName("Car4");
	System.out.println("Game Start");
	Thread.sleep(1000);
	System.out.println("1...");
	Thread.sleep(1000);
	System.out.println("2...");
	Thread.sleep(1000);
	System.out.println("3...");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	Thread t = Thread.currentThread();
	//System.out.println(t);
	t1.join();
	t2.join();
	t3.join();
	t4.join();
	System.out.println("Game Finish");
	}

}


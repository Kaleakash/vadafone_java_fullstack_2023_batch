package com;
class Task implements Runnable {
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	System.out.println(name);
	}
}
public class TaskImplementation {
	public static void main(String[] args) {
	Task tt = new Task();
	Thread t1 = new Thread(tt);
	Thread t2 = new Thread(tt);
	Thread t3 = new Thread(tt);
	Thread t4 = new Thread(tt);
	t1.setName("Steven");
	t2.setName("Lex");
	t3.setName("John");
	t4.setName("Raj");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	Thread t = Thread.currentThread();
	System.out.println(t);
	}

}

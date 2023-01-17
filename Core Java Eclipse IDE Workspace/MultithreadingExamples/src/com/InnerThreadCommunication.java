package com;
class Work implements Runnable{
	@Override
	public synchronized void run() {
	
		String name = Thread.currentThread().getName();
		for(int i=0;i<=10;i++) {
			try {
			Thread.sleep(500);
			System.out.println(name+" "+i);
			
			if(name.equals("Steven") && i==4) {
				wait();
			}
			if(name.endsWith("Leena") && i==6) {
				
				wait();
			}
			if(name.equals("John") && i==8) {
				notifyAll();
			}
			}catch(Exception e) {}
		}
	}
}
public class InnerThreadCommunication {

	public static void main(String[] args) {
	Work ww = new Work();
	Thread t1 = new Thread(ww);
	Thread t2 = new Thread(ww);
	Thread t3 = new Thread(ww);
	t1.setName("Steven");
	t2.setName("John");
	t3.setName("Leena");
	t1.start();
	t2.start();
	t3.start();
	}

}

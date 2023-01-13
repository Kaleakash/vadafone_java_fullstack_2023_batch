package com;
interface Team1{
	public int add(int x, int y);
}
interface Team2 {
	public int sub(int x, int y);
}
class Server implements Team1, Team2 {
	@Override
	public int add(int x, int y) {
		return x+y;
	}
	@Override
	public int sub(int x, int y) {
		return x-y;
	}
	public void ownMethod() {
		System.out.println("My Own method");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
	Server ss = new Server();
	System.out.println(ss.add(100, 200));
	System.out.println(ss.sub(200, 50));
	ss.ownMethod();
	Team1 t1 = new Server();
	Team2 t2 = new Server();
	System.out.println(t1.add(10, 20));
	//System.out.println(t1.sub(12,10));
	System.out.println(t2.sub(100, 50));
	//System.out.println(t2.add(1,2));
	}
}

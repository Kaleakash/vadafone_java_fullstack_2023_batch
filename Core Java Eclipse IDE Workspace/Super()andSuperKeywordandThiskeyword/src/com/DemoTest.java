package com;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mgr = new Manager();
		mgr.disMgr();
		Manager mgr1 = new Manager(1,"Lex",45000,5);
		mgr1.disMgr();
		
		mgr1.disDeptInfo();
	}

}

package com.service;

import org.testng.annotations.Test;

public class TestPriority {
//  @Test
//  public void f() {
//	 System.out.println("f test"); 
//  }
//  @Test
//  public void a() {
//	  System.out.println("a test");
//  }
//  
//  @Test
//  public void c() {
//	  System.out.println("c test");
//  }
//  @Test
//  public void b() {
//	  System.out.println("b test");
//  }
	
	@Test(priority = 4)
	  public void f() {
		 System.out.println("f test"); 
	  }
	  @Test(priority = 2)
	  public void a() {
		  System.out.println("a test");
	  }
	  
	  @Test(priority = 1)
	  public void e() {
		  System.out.println("e test");
	  }
	  @Test(priority = 1)
	  public void c() {
		  System.out.println("c test");
	  }
	  @Test(priority = 3)
	  public void b() {
		  System.out.println("b test");
	  }
  
}





package com.service;

import org.testng.annotations.Test;

public class CarTest {

  @Test
  public void mailageTest() {
	  System.out.println("Car mailage testing ");
  }

  @Test(groups = {"speed"})
  public void speedTest() {
	  System.out.println("Car speed testing ");
  }

  @Test
  public void wheelCodingTest() {
	  System.out.println("Car wheel testing ");
  }
}

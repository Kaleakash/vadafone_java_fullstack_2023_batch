package com.service;

import org.testng.annotations.Test;

public class BikeTest {

  @Test
  public void mailageTest() {
	  System.out.println("Bike mailage testing ");
  }

  @Test(groups = {"speed"})
  public void speedTest() {
	  System.out.println("Bike speed testing ");
  }

  @Test
  public void wheelCodingTest() {
	  System.out.println("Bike wheel testing ");
  }
}

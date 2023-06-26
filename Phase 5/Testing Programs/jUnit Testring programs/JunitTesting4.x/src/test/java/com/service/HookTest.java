package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HookTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this function call only once before all test function");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this function call only once after all test function");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this function call again and again before all test function");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this function call again and again after all test function");
	}
	@Test
	public void test1() {
		System.out.println("First test function");
	}
	@Test
	public void test2() {
		System.out.println("Second test function");
	}
	
	
}

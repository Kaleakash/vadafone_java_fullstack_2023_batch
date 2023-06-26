package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest {

	@Test				// it is like a main method 
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(30, result);
	}

}

package com.junitTest.basicsTest;

import org.junit.*;

import com.junitTest.basics.Calculator;

import static org.junit.Assert.*;

public class CalculatorTest {

	@Test
	public void testAddPass() {

		assertEquals(3, Calculator.add(1, 2));
		assertEquals(-3, Calculator.add(-4, 1));
		assertEquals(9, Calculator.add(0, 9));

	}

	@Test
	public void testFailAdd() {
		assertNotEquals(0, Calculator.add(1, 2));
	}

	@Test
	public void testSubPass() {
		assertEquals(1, Calculator.sub(2, 1));
		assertEquals(-1, Calculator.sub(-2, -1));
		assertEquals(0, Calculator.sub(2, 2));
	}

	@Test
	public void testSubFail() {
		assertNotEquals(0, Calculator.sub(2, 1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDevInt() {
		Calculator.divInt(5, 0);

	}
	
	

}

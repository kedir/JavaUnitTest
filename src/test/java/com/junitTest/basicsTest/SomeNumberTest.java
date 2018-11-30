package com.junitTest.basicsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import com.junitTest.basics.SomeNumber;

public class SomeNumberTest {

	private SomeNumber numOne;
	private SomeNumber numTwo;

	@Before
	public void setUP() throws Exception {
		System.out.println("Run @Before");
		numOne = new SomeNumber(22);
		numTwo = new SomeNumber(33);

	}
	
	@After
	public void closeTest() {
		System.out.println("Test is complete");
	}
	
	@Test
	public void testGetterSetter() {
		System.out.println("Testing Getters and Setters");
		int value = 33;
		numOne.setNumber(value);
		assertEquals(value, numOne.add(numTwo).getNumber());
		
		assertEquals(value, numOne.getNumber());
		
	}

}

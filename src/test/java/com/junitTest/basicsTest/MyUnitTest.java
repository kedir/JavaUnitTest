package com.junitTest.basicsTest;

import org.junit.jupiter.api.Test;
import com.junitTest.basics.MyUnit;
import static org.junit.Assert.*;

/**
 * 
 * @author milanpatel
 *
 *  assertArrayEquals()
	assertEquals()
	assertTrue() + assertFalse()
	assertNull() + assertNotNull()
	assertSame() and assertNotSame()
	assertThat()
 *
 */


public class MyUnitTest {
	MyUnit unit = new MyUnit();

	@Test
	public void testConcateString() {
	

		String result = unit.concateString("Test", "Unit");

		assertEquals("TestUnit", result);

	}
	
	@Test
	public void testGetTheStringArray() {
		String [] arr = {"One","Two","Three"};
		String [] resultArray = unit.getTheStringArray(arr);
	
		assertArrayEquals(arr, resultArray);
		
	}
	
	@Test
	public void testVerifyTrueORFals() {
		
		boolean b1 = unit.verifyTrueORFals(5, 5);
		assertTrue(b1);
		
		boolean b2 = unit.verifyTrueORFals(51, 5);
		assertFalse(b2);
		
		assertEquals(b1, true);
		
	}
	
	
	@Test
	public void testNullValueOfObject() {
		

		String str = null;
		assertNull(str);
		assertNotNull(unit);
		
	}

}

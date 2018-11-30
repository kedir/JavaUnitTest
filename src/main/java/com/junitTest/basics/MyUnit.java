package com.junitTest.basics;

public class MyUnit {

	public String concateString(String one, String two) {
		return one + two;
	}

	public String[] getTheStringArray(String[] strArray) {
		return strArray;

	}

	public boolean verifyTrueORFals(int numOne, int numTwo) {
		if (numOne == numTwo) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		MyUnit unit = new MyUnit();
		String[] arr = { "One", "Two", "Three" };
		System.out.println(unit.getTheStringArray(arr));

	}

}

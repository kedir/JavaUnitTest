package com.junitTest.basics;

public class Calculator {
	
	public static int add(int numOne, int numTwo) {
		return numOne + numTwo;
	}
	
	public static int sub(int numOne, int numTwo) {
		return numOne - numTwo;
	}
	
	public static int multiply(int numOne, int numTwo) {
		return numOne * numTwo;
	}
	
	public static int divInt(int numOne, int numTwo) {
		if (numTwo ==0) {
			throw new IllegalArgumentException("Number can not devide by zero");
		}
		return numOne/numTwo;
		
	}
	
	public static double divDouble(int numOne, int numTwo) {
		if (numTwo ==0) {
			throw new IllegalArgumentException("Number can not devide by zero");
		}
		return (double)numOne/numTwo;
		
	}

}

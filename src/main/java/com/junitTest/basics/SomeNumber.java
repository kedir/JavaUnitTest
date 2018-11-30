package com.junitTest.basics;

public class SomeNumber {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "SomeNumber [number=" + number + "]";
	}

	public SomeNumber(int number) {
		super();
		this.number = number;
	}
	
	public SomeNumber add(SomeNumber num) {
		this.number = num.number;
		return this;
	}
	

}

package com.example;

public class Calculator {
	
	// add
	public int add(int x,int y) {
		return x+y;
	}
	
	// subtract
	public int subtract(int x,int y) {
		return x-y;
	}
	
	// multiply
	public int multiply(int x,int y) {
		return x*y;
	}
	
	// divide
	public int divide(int x,int y) {
		if(y==0) {
			throw new IllegalArgumentException("cannot divide by zero");
		}
		return x/y;
	}
	
	public boolean isPositive(int x) {
		//return x>=0;
		return false;
	}

}

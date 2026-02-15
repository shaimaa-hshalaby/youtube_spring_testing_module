package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	
	@Test
	public void testAdd() {
		// setup 
		Calculator cal = new Calculator();
		int x = 4;
		int y = 5;
		
		// execute code 
		int result = cal.add(x, y);
		
		// validation
		assertEquals(9, result, "the result should be 9");
		
	}
	
	@Test
	public void testSubtract() {
		// setup 
		Calculator cal = new Calculator();
		int x = 10;
		int y = 5;
		
		// execute code 
		int result = cal.subtract(x, y);
		
		// validation
		assertEquals(5, result, "the result should be 5");
		
	}
	
	@Test
	public void testMultiply() {
		// setup 
		Calculator cal = new Calculator();
		int x = 10;
		int y = 5;
		
		// execute code 
		int result = cal.multiply(x, y);
		
		// validation
		assertEquals(50, result, "the result should be 50");
		
	}
	
	@Test
	public void testDivide() {
		// setup 
		Calculator cal = new Calculator();
		int x = 10;
		int y = 5;
		
		// execute code 
		int result = cal.divide(x, y);
		
		// validation
		assertEquals(2, result, "the result should be 2");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

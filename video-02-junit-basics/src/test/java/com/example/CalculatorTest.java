package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	// assertEquals(expectedValue, actualValue)
	
	// assertTrue(condition should return true)  & assertFalse(condition should return false)
	
	//assertNull() & assertNotNull()
	
	
	// assertAll()
	
	// assertTimeout()
	
	// assertThrows()
	
	
//	@Test
//	public void testAdd() {
//		// setup 
//		Calculator cal = new Calculator();
//		int x = 4;
//		int y = 5;
//		
//		// execute code 
//		int result = cal.add(x, y);
//		
//		// validation
//		assertEquals(9, result, "the result should be 9");
//		
//	}
//	
//	@Test
//	public void testSubtract() {
//		// setup 
//		Calculator cal = new Calculator();
//		int x = 10;
//		int y = 5;
//		
//		// execute code 
//		int result = cal.subtract(x, y);
//		
//		// validation
//		assertEquals(5, result, "the result should be 5");
//		
//	}
//	
//	@Test
//	public void testMultiply() {
//		// setup 
//		Calculator cal = new Calculator();
//		int x = 10;
//		int y = 5;
//		
//		// execute code 
//		int result = cal.multiply(x, y);
//		
//		// validation
//		assertEquals(50, result, "the result should be 50");
//		
//	}
//	
	@Test
	public void testDivide() {
		// setup 
		Calculator cal = new Calculator();
		int x = 10;
		int y = 5;
		int z = 0;
		
		// execute code 
		int result = cal.divide(x, y);
		
		// validation
		assertEquals(2, result, "the result should be 2");
		assertThrows(IllegalArgumentException.class, ()-> cal.divide(x, z),"this code should throw IllegalArgumentException");
		
	}
	

//	@Test
//	public void testPositiveInt() {
//		Calculator cal = new Calculator();
//		int x =5;
//		int y=0;
//		int z=-5;
//		
//		assertTrue(cal.isPositive(x),"the result should be True");
//		assertTrue(cal.isPositive(y),"the result should be True");
//		assertFalse(cal.isPositive(z),"the result should be True");
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

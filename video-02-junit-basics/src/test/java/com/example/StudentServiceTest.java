package com.example;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class StudentServiceTest {
	
	// assertNotNull, assertNull
	// assertAll()
	// assertTimeout()
	
	@Test
	public void testFindStudentById() {
		// setup 
		StudentService service = new StudentService();
		

		// execute & validate
		assertNotNull(service.findStudentById(1),"the result should not be null");
		assertNull(service.findStudentById(5),"the result should be null");
	}
	
	@Test
	public void testFindStudentByIdUsingAssertAll() {
		// setup 
		StudentService service = new StudentService();
		
//		assertEquals("Ali", service.findStudentById(1).getName());
//		assertEquals("Omar", service.findStudentById(2).getName());
//		assertEquals("Hamza", service.findStudentById(3).getName());
		
		// execution & validation
		assertAll("test FindStudentByIds", 
				() -> assertEquals("Ali", service.findStudentById(1).getName()),
				() -> assertEquals("Omar", service.findStudentById(2).getName()),
				() -> assertEquals("Hamza", service.findStudentById(3).getName())
				);
				
		
	}
	
	@Test
	public void testFindStudentWithDelay() {
		// setup 
		StudentService service = new StudentService();
		
		// execution & validation
		assertTimeout(Duration.ofMillis(500), ()->service.findStudentWithDelay());
				
	}
}

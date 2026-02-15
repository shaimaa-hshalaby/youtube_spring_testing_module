package com.example;

import java.time.Duration;

public class StudentService {
	
	public Student findStudentById(int id) {
		
		if(id == 1) {
			return new Student(1,"Ali");
		}else if(id == 2) {
			return new Student(2,"Omar");
		}else if(id == 3) {
			return new Student(3, "Hamza");
		}
		return null;
	}
	
	public Student findStudentWithDelay() throws InterruptedException {
		    Thread.sleep(Duration.ofMillis(300));
			return new Student(1,"Ali");

		
	}

}

package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourse implements CourseService {

	@Override
	public void course() {
		System.out.println("Student joined java Course..........");
		
	}

}

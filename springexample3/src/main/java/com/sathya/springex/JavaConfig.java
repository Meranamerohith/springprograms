package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {

	@Bean 
	public EmailMessage emailMessage() {
		EmailMessage emailMessage = new EmailMessage();
		return emailMessage;
	}
	
	@Bean 
	public JavaCourse javaCourse() {
		JavaCourse javaCourse = new JavaCourse();
		return javaCourse;
	}
	
	@Bean
	public Student student() {
		Student student= new Student();
		student.setEmailMessage(emailMessage());
		student.setJavacourse(javaCourse());
		return student;
	}
	
}

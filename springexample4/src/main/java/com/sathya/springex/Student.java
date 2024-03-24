package com.sathya.springex;

public class Student {
	
	
	private EmailMessage emailMessage;
	private JavaCourse javacourse;
	

  
	public Student(EmailMessage emailMessage, JavaCourse javacourse) {
		super();
		this.emailMessage = emailMessage;
		this.javacourse = javacourse;
   }
   
	public void details() {
		emailMessage.message();
		javacourse.course();
	}


}

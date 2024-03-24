package com.sathya.springex;

public class Student {
	
	
	public EmailMessage getEmailMessage() {
		return emailMessage;
	}



	public void setEmailMessage(EmailMessage emailMessage) {
		this.emailMessage = emailMessage;
	}



	public JavaCourse getJavacourse() {
		return javacourse;
	}



	public void setJavacourse(JavaCourse javacourse) {
		this.javacourse = javacourse;
	}



	private EmailMessage emailMessage;
	private JavaCourse javacourse;
	
	

	public void details() {
		emailMessage.message();
		javacourse.course();
	}


}

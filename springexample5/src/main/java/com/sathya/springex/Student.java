package com.sathya.springex;

public class Student {
	
	
	private EmailMessage emailMessage;
	private JavaCourse javacourse;
	
	
	
   
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




	public void details() {
		emailMessage.message();
		javacourse.course();
	}


}

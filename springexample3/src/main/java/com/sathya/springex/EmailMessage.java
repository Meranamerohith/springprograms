package com.sathya.springex;

import org.springframework.stereotype.Component;

@Component
public class EmailMessage implements EmailService {

	@Override
	public void message() {
		System.out.println("Student email get the messages........");
		
	}
    
}

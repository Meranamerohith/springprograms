package com.sathya.springex;

public class Person {
     String name;
     String email;
	
	
      
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public void personInfo() {
		System.out.println("Name :"+name);
		System.out.println("Email:"+email);
	}
     
}

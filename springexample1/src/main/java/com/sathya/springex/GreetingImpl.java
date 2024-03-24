package com.sathya.springex;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
		System.out.println("This is Spring First Example.....");
		System.out.println("Ratan sir wow..........");
	}

	public GreetingImpl() {
		super();
		System.out.println("Greeting Constructor :: object created");
		// TODO Auto-generated constructor stub
	}

}

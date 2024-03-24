package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
	
	@Bean
	public Person person1() 
	{
		Person person = new Person("sathya","sathya@gmail.com");
	    return person;
	}
	
	@Bean 
	public Person person2() {
		Person person = new Person("spring","spring@gmail.com");
		return person;
	}
	
	@Bean 
	public Person person3() {
		Person person = new Person("Maven","Maven@gmail.com");
		return person;
	}
	
	
}

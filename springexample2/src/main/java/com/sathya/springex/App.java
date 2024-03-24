package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	
    	Traveller traveller = context.getBean("traveller",Traveller.class);
    	traveller.StartJourney();
    	
       // System.out.println( "Hello World!" );
    }
}
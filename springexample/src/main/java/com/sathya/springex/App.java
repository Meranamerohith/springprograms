package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
      
           Person person = context.getBean("person1",Person.class);
           person.setName("sai");
           person.setEmail("rohithsai504@gmail.com");
           person.personInfo();
           
           System.out.println("*********************************");
          
           Person person1 = context.getBean("person2",Person.class);
           person1.setEmail("rohith");
           person1.setName("rohith@gmail.com");
           person1.personInfo();
           
           
           System.out.println("*********************************");
           
           Person person2 = context.getBean("person2",Person.class);
           person2.setEmail("dheeraj");
           person2.setName("dheeraj@gmail.com");
           person2.personInfo();
           
           
    }
}

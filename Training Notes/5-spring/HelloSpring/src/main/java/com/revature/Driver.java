package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld object = (HelloWorld) context.getBean("helloWorld");
		
		HelloWorld object2 = (HelloWorld) context.getBean("helloWorld", HelloWorld.class);
		
		HelloWorld object3 = (HelloWorld) context.getBean(HelloWorld.class);
		
		
		object.getMessage();
		
		object2.getMessage();
		object3.getMessage();
		
		System.out.println(object == object2);
		
	}

}

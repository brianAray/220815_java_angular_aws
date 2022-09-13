package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.byname.Application;
import com.revature.bytype.Employee;
import com.revature.constructor.Performer;

public class Driver {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Autowire by Name
		Application application = (Application) context.getBean("application");
		
		System.out.println("Application Details: " + application);
		
		
		// Autowire by Type
		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee);
		
		
		// Autowire by Constructor
		Performer performer = (Performer) context.getBean("performer");
		
		System.out.println(performer);
	}

}

package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.revature.byname.Application;
import com.revature.bytype.Employee;
import com.revature.constructor.Performer;

@Configuration
@ComponentScan("com.revature")
public class AnnoDriver {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AnnoDriver.class);
		
		// Setter Injection
		Application application = (Application) context.getBean(Application.class);
	
		System.out.println(application);
		
		// Constructor Injection
		Performer performer = (Performer) context.getBean(Performer.class);
		
		System.out.println(performer);
		
		// Example of Field Injection
		Employee employee = (Employee) context.getBean(Employee.class);
		System.out.println(employee);
		
		
		/*
		 * Constructor injection has a few advantages over Field Injection
		 * First, and foremost is testability
		 * If you use field Injection for unit testing Spring Beans
		 * During the construction, you cannot initialize certain states of the 
		 * bean. The only way is through the Reflection API which completely breaks
		 * encapsulation
		 * The code will also be less safe than just using a Constructor call
		 * 
		 * You also can't enforce class level invariants, it's possible to have a class
		 * without a property initialized leading to random NullPointerExceptions.
		 * 
		 * Constructors are also natural to OOP
		 * 
		 * Main disadvantage is its verbosity, especially when dependencies grow.
		 * This is actually useful for making sure your classes do not grow in dependencies
		 * 
		 */
	}
}

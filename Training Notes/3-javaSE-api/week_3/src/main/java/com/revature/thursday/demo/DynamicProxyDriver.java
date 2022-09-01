package com.revature.thursday.demo;

import java.lang.reflect.Proxy;

import com.revature.thursday.model.Adult;
import com.revature.thursday.model.Person;

public class DynamicProxyDriver {
	
	public static void main(String[] args) {
		Adult adult = new Adult("Mike", 70, "London", "England");
		
		// I want to modify the method at runtime but I can't as it's not my code
		// It's from an external framework
		
		adult.introduce();
		
		/*
		 * Reflection API is used to examine or modify the behavior at runtime
		 */
		
		// First get the Classloader for the original object that we want to create a proxy for
		ClassLoader adultClassLoader = adult.getClass().getClassLoader();
		
		// Capture all the interfaces that the original object implements
		
		Class[] interfaces = adult.getClass().getInterfaces();
		
		
		// Create a proxy for our Adult obj
		Person proxyAdult = (Person) Proxy.newProxyInstance(adultClassLoader, interfaces, new PersonInvocationHandler(adult));
	
	
		/*
		 * What is a Proxy?
		 * 
		 * A proxy is a design pattern. We create and use proxy objects when we want to add or
		 * modify some functionality of an already existing class. The proxy object is used instead
		 * of the original one
		 * 
		 * Usually the proxy objects have the same methods as the original one and in Java, proxy classes
		 * are usually extended versions of the original class. The proxy has a handle to the original object
		 * and can call the method on that (InvocationHandler)
		 */
		
		proxyAdult.introduce();
		
	
	}

}

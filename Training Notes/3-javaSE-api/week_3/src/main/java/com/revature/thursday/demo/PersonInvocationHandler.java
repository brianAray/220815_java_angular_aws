package com.revature.thursday.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.revature.thursday.model.Person;


/*
 * Dynamic Proxy Design Pattern
 * 
 * A proxy is an "add-on" to a class, that allows us to intercept method invocation
 * and modify runtime behavior
 * 
 * Resource
 * https://codegym.cc/groups/posts/208-dynamic-proxies
 */

public class PersonInvocationHandler implements InvocationHandler{
	
	/*
	 * The invocation Handler interface is a special interface that lets us
	 * intercept any method call to our object and add the additional behaviour
	 * 
	 * We need to create our own intercepter (this is the PersonInvocationHandler)
	 * It's a class that implements the InvocationHandler
	 * 
	 * We will need to pass an instantiation of this class into the Proxy.newProxyInstance()
	 * Constructor in order to make a proxy object
	 */
	
	private Person person;
	
	public PersonInvocationHandler(Person person) {
		super();
		this.person = person;
	}
	

	// Using this method, we can modify the runtime behavior of the class using reflection
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// Here we're adding extra functionality and still invoking the original method
		System.out.println("Hello!");
		
		// The invoke() method has access to the originally invoked method and all its args
		return method.invoke(person, args);
	}

}

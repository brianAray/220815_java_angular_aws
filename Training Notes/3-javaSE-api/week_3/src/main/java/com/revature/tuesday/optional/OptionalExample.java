package com.revature.tuesday.optional;

import java.util.Optional;

public class OptionalExample {
	
	/*
	 * The optional class
	 * 
	 * This provides a type-level solution for representing optional values instead of null references
	 */
	
	// Creating Optionals
	public void createOptionalExample() {
		// Empty Optional
		
		Optional<String> empty = Optional.empty();
		
		// Optional using Static method of()
		// You cannot pass ina  null value or you get a NullPointerException
		String name = "Brian";
		Optional<String> opt = Optional.of(name);
		
		// If you are not sure if the value you pass in will be null, then use the ofNullable() method
		
		Optional<String> optNullable = Optional.ofNullable(null);
		
		

		
	}
	
	/*
	 * We use the ifPresent() method to check if there is a value inside the Optional object
	 * A value is present only if we have created Optional with a non null value
	 * 
	 * Checking Value Presence : ifPresent()
	 * 
	 * To check if something is present, it returns ture if wrapped value is not null
	 */
	
	public void conditionalPresenceExample() {
		// Typical way of doing null checks
		
		String name = "name";
		
		if(name != null) {
			System.out.println(name.length());
		}
		
		// There is no guarantee that after you have printed the variable, you won't use it again and forget to
		// do a null check
		
		// Optional forces you to deal with it explicitly, this is good programming practice
		
		Optional<String> opt = Optional.of(name);
		opt.ifPresent(thing -> System.out.println(thing.length()));
		
	}
	
	/*
	 * Default values with orElse()
	 * 
	 * The orElse() method is used to retrieve the value wrapped inside an optional instance
	 * It takes one parameter which acts as a default value
	 * The orElse method returns the wrapped value if it is present or its argument otherwise
	 */
	
	public void orElseExample() {
		String nullName = null;
		Optional<String> opt = Optional.ofNullable(nullName);
		
		
		
		String name = opt.orElse("Mike");
		
		System.out.println(name);
		
	}
	
	
	
	
	public static void main(String[] args) {
		OptionalExample oe = new OptionalExample();
		oe.createOptionalExample();
		oe.conditionalPresenceExample();
		oe.orElseExample();
	}

}

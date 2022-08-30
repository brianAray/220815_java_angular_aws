package com.revature.tuesday.functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class SimpleFunction {
	/*
	 * Simple case, a method that takes one value and returns one value
	 * This is represented by the Function interface, which is parameterized by the types of its argument and return value
	 * 
	 * Public interface Function<T, R> {...}
	 * 
	 * One use case is the Map.ComputeIfAbsent method
	 * This method returns a value from a map by key, but calculates if a key is not already present in a map
	 * To calculate a value, it used the passed Function implementation
	 */
	
	public static void simpleMapFunction() {
		
		Map<String, Integer> nameMap = new HashMap<>();
		
		nameMap.put("John", 123);
		
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		
		/*
		 * In this case, we will calculate a value by applying a function to a key, put inside a map,
		 * and also returned from a method call
		 * 
		 * We may replace the lambda with a method reference that matches passed and returned value types
		 */
		
		Integer value2 = nameMap.computeIfAbsent("John", String::length);
		
		
		System.out.println(nameMap);
		
		System.out.println(value);
		System.out.println(value2);
		
		
	}
	
	public static void composeFunctions() {
		// The Function interface also has a default method called compose that lets use combine several functions into one
		
		Function<Integer, String> intToString = i -> Integer.toString(i);
		
		// This can be replaced with a method reference
		
		Function<Integer, String> coolerIntToString = Object::toString;
		
		Function<String, String> quote = s -> "'" + s + "'";
		
		// Combine these functions in a specific order with compose
		
		Function<Integer, String> quoteIntToString = quote.compose(coolerIntToString);
		
		
		System.out.println(quoteIntToString.apply(5));
		
	}
	
	
	public static void main(String[] args) {
		//SimpleFunction.simpleMapFunction();
		SimpleFunction.composeFunctions();
	}

}

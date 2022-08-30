package com.revature.tuesday.functional;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterface {

	/*
	 * Introduced in Java 8, the lambda
	 * A lambda is an anonymous function that can be handled as a first class language citizen
	 * First Class language citizen = We can move them like other data types (primitives and objects)
	 * 
	 * Before Java 8 we had to create a class for every case where encapsulation was needed
	 * this led to alot of boiler plate code to define something that did a simple function
	 * 
	 * 
	 * You can create your own functional interface, a lambda simply takes in the functional interface and uses it
	 * But it is recommended that you use the standard interfaces
	 * 
	 * Any functional interface should have the @FunctionalInterface annotation
	 *Any interface with a SAM (Single Abstract MEthod) is an FI
	 *
	 * In J8 default methods are not abstract and do not count
	 * An FI may have multiple default methods
	 * 
	 */
	
	public void lambdaExample() {
		List<Integer> integerList = Arrays.asList(1,2,3,4);
		
		System.out.println(integerList);
		
//		for(int i =0; i < integerList.size();i++) {
//			System.out.println(integerList.get(i));
//		}
//		
//		for(int i : integerList) {
//			System.out.println(i);
//		}
		
		// Parameter -> expression
		// if there is more than one parameter
		// (param1, param2) -> expression
		
		integerList.forEach((n) -> System.out.println(n + 2));
		
		System.out.println(integerList);
		
	
		
		
	}
	
	public static void main(String[] args) {
		FunctionalInterface fi = new FunctionalInterface();
		fi.lambdaExample();
	}
	
}

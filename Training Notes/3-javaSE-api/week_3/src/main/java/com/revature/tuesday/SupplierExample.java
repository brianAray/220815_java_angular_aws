package com.revature.tuesday;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {

	/*
	 * The supplier interface represents a function which does not take in any arguments but produces
	 * a value of Type T
	 * 
	 * T : type of the result
	 * 
	 * lambda expression is get()
	 * 
	 * Suppliers are useful when we don't need to supply any value and obtain a result at the same time
	 */
	
	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random();
		
		//System.out.println(randomValue.get());
		
		Consumer<Double> printDouble = a -> System.out.println(a);
		
		printDouble.accept(randomValue.get());
	}
	
}

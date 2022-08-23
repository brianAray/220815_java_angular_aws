package com.revature.nesting;

interface Age {
	int x = 21;
	void getAge();
}

class MyClass implements Age{
	@Override public void getAge() {
		System.out.println("Age is " + x);
	}
}

public class AnonymousClass {

	/*
	 * Nested classes need to be understood before you can really start working with anonymous classes
	 * 
	 * It is an inner class without a name and for which only a single object is created.
	 * 
	 * An anonymous inner class can be useful when making an instance of an object with certain extra features
	 * such as overriding methods of a class or interface without havign to actually create a subclass
	 * 
	 * Differences between a regular class and anonymous inner classes
	 * 
	 * - A normal class can implement any number of interfaces but the anonymous inner class can only do one
	 * - A regular class can extend a class and implement interfaces simulataneuosly. You cann only extend
	 *   or implement an interface but not both with anonymous
	 * - For normal classes we can write any number of constructors but we can't write any constructor for an
	 * anonymous class as it does not have any name
	 */
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		
		obj.getAge();
		
		
		Age obj2 = new Age() {
			
			@Override public void getAge() {
				System.out.println("Age is " + x);
			}
			
		};
		
		obj2.getAge();
		
		
		Thread t = new Thread() {
			
			public void run() {
				for(int i =0; i< 1000; i++) {
					System.out.println("Child Thread: " + i);
				}
			}
		};
		
		t.start();
		
		for(int i =0; i< 1000; i++) {
			System.out.println("Main Thread: " + i);
		}
	}
	
	/*
	 * 
	 * Types of Anonymous Inner Classes
	 * 
	 * 1. Anon Class that extends a class
	 * 2. Anon class that implements an interface
	 * 3. Anon class that defines inside method/constructor argument
	 * 
	 */
}



package com.revature.nesting;

public class NestedTypes {

	/*
	 * In Java it is possible to have a class within a class
	 * They help you to logically group classes that are only used in one place
	 * This increases the use of encapsulation, and created more readable and maintainable code
	 * 
	 * - The scope of a nested class is bounded by the scope of its enclosing class
	 * - A nested class has access to the members, including private members, of the class where it is
	 *   nested. The reverse is also true
	 *   
	 * - A nested class is also a member of the enclosing class
	 * - A member of its enclsoing class, a nested class, can be private, public, protected or package private (default)
	 * 
	 * 
	 * We split nested classes into 2 types:
	 * - Static nested classes : nested classes that are declared static
	 * - Inner class : inner classes are non static nested classes
	 */
	
	public static void main(String[] args) {
		OuterClass outerObject = new OuterClass();
		
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
	}
	
}

class OuterClass {
	
	// static member
	static int outer_x = 5;
	
	// instance member
	int outer_y = 10;
	
	//private member
	private int outer_private = 100;
	
	// inner class
	
	class InnerClass{
		
		void display() {
			
			// Can access static members of outer class
			System.out.println("outer x is : " + outer_x);
			
			// Can also access non-static members of outer class
			System.out.println("outer y is : " + outer_y);
			
			// can also access private members
			System.out.println("outer_private is : " + outer_private);
		}
	}	
}

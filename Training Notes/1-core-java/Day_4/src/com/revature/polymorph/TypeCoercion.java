package com.revature.polymorph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeCoercion {
	
	/*
	 * Conversion of one data type to another is easy in Java and in other languages
	 * 
	 * There are two types of conversion:
	 * 
	 * - Implicit : This type of conversion is automatically done, in Java, by the JVM
	 * - Explicit : This is done by the programmer, based on their requirements
	 * 
	 * - Implicit - Coercion
	 * - Explicit - Casting
	 * 
	 * 
	 */
	
	/*
	 * Widening and Narrowing
	 * 
	 * Widening also known as upcasting, is a conversion that implicitly takes place in these scenarios:
	 * 
	 * - Smaller primitve type is automatically accomodated into a larger / wider data type
	 * 
	 * - A reference variable of a sub class is automatically accommodated in a reference varaible to its
	 * 	 parent (super class)
	 */
	
	public static void main(String[] args) {
		
		int number = 10;
		
		double result = number / 5;
		
		System.out.println(result);
		
		// Conversion of the literal value to a floating point value
		// Peforms floating point division
		// Stores teh result into memory allocated to the result variable
		
		// byte + short = int
		// short + byte = int
		// int + int = int
		// int + float = float
		// float + double = double
		
		byte byt = 10;
		
		short aShort = byt; // byte is widened to short
		int i = byt; // byte is widened to int
		
		
		/*
		 * Widening with a reference (upcasting)
		 */
		
		B b = new B();
		A a; // reference of a subclass (B) type is widened to a reference of the superclass
		
		a = b;
		
		a.message();
		
	
		/*
		 * WE have created a class A which is extended by Class B, hence A is a superclass and B is a subclass
		 * The method message () of superclass A is overridden in its subclass B
		 * 
		 * Next we create the object B, which is assigned a reference, b
		 * This subclass B reference is widened / upcasted to a superclass A
		 */
		
		
		/*
		 * Narrowing, also known as downcasting / casting, this has to be done explicitly
		 * 
		 * - Narrowing a wider/ bigger primitive to a smaller primitive type value
		 * - Narrowing a superclass to a subclass reference, during inheritance
		 */
		
		double aDouble = 10.5;
		
		byte aByte1 = (byte) aDouble;
		short aShort2 = (short) aDouble;
		
		System.out.println(aDouble);
		System.out.println(aByte1);
		System.out.println(aShort2);
		
		// With objects and references
		
		A newA = new B(); // An object of subclass B is referenced by a refernce of the superclass
		B newB = (B) a; // A reference of superclass(A) type is downcasted/narrowed to the subclass of B
		
		b.message();
		

	}
	
}

class A{
	public void message() {
		System.out.println("Message from A");
	}
}

class B extends A{
	
	public void message() {
		System.out.println("Message from B");
	}
}

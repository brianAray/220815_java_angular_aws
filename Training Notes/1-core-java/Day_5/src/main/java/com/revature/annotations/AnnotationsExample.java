package com.revature.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class AnnotationsExample {

	/*
	 * Annotations are used to provide supplemental information about a program
	 * 
	 * - start with @
	 * - Do not change the action of a compiled program
	 * - Help to associate metadata (information) to the program, i.e. instance variable, constructors, methods, etc
	 * - Are not pure comments as they can change the way a program is treated by the compiler
	 * - Basically are used to provide additional information, so is used as an alternative to XML and Java Marker interfaces
	 * 
	 * 
	 * Categories
	 * 
	 * 1. Marker Annotations
	 * 2. Single Value Annotations
	 * 3. Full Annotations
	 * 4. Type Annotations
	 * 5. Repeating Annotations
	 * 
	 * 
	 * 
	 * Marker Annotations
	 * The only purpose of this is to mark declarations.
	 * These annotations do not contain members and do consist of any data
	 * Its presence as an annotation is sufficient
	 * @Override is an example of a Marker annotations
	 * 
	 * @TestAnnotation()
	 * 
	 * 
	 * Single Value Annotations
	 * These contain only one member and allow a shorthand form of specifying the value of the member
	 * when the annotation is applied and odn't need to speicfy the name of the memebr.
	 * To use this shorthand, the name of the member must be a value
	 * 
	 * @TestAnnotation("testing")
	 * 
	 * 
	 * Full Annotations
	 * These annotations consist of multiple data members, names, values, pairs
	 * 
	 * @TestAnnotation(owner="Mike", value="Thing")
	 * 
	 * 
	 * 
	 */
	
	
}



@Target(ElementType.TYPE_USE)
@interface MyTypeUseAnnotation{}

@Target(ElementType.CONSTRUCTOR)
@interface MyConstructorAnno{}

class Base {

	@MyTypeUseAnnotation
	private String data;

	@MyConstructorAnno
	public Base(String data) {
		this.data = data;
	}

	public void display() {
		System.out.println("Base display()");

	}
}

class Derived extends Base{

	@MyConstructorAnno
	public Derived(String data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Derived display()");
	}
}

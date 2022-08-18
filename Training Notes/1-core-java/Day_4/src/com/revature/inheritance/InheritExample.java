package com.revature.inheritance;

public class InheritExample {
	
	/*
	 * Java does not support multiple inheritance
	 * 
	 * Multiple inheritance is a feature of OOPP, where a class can inherit properties of more than
	 * one parent class. The problem occurs when there exists methods that share the same signature
	 * in both the superclasses and subclass. On calling the method, the compiler cannot determine
	 * which method to be called.
	 * 
	 * The diamond problem.
	 * 
	 * 					GrandParent
	 * 					/		\
	 * 				   /		 \
	 * 				Parent1		Parent2
	 * 					\		/
	 * 					 \	   /
	 * 					  Child
	 * 
	 * To get around the diamond problem in Java, we can use interfaces to allow multiple inheritance
	 * 
	 * To solve the issue of method sharing names, interfaces allow you to create default methods
	 */
	
	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}

}


interface parent1{
	
	default void show() {
		System.out.println("Default parent 1");
	}
	
}

interface parent2{
	
	default void show() {
		System.out.println("Default parent 2");
	}
	
}

class Child implements parent1, parent2{
	
	public void show() {
		parent1.super.show();
		parent2.super.show();
	}
	

}
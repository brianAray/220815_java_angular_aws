package com.revature.polymorph;

public class Polymorphism {
	
	/*
	 * Polymorphism is a core pillar of OOP, it describes situations in which something occurs in 
	 * several different forms.
	 * In computer science, it describes the concpet that you can access objects of different types
	 * using the same itnerface. Each type can provide its own independent implemntation of this interface
	 * 
	 * To know whether an object is polymorphic, you can perform a test, the is-a or instanceof test.
	 * All java classes extend the class Object, due to this, all objects in Java are polymorphic because
	 * they pass at least two instanceof checks
	 */
	
	/*
	 * Java supports two types of polymorphism
	 * - static or compile time
	 * - dynamic
	 * 
	 * 
	 * Static Polymorphism
	 * 
	 * In OOP languages, you are able to implement multiple methods within the same class that use the same
	 * name. But, Java uses a different set of parameters called method overloading and represents a static
	 * form of polymorphism.
	 * 
	 * There are three citerias:
	 * 
	 * - Need to have different numbers of parameters, one method accepting 2, the other could accept 3
	 * - Types of parameters need to be different, one accepting String, the other, Integer
	 * - Expect the parameters in a different order. Example, one is expected String and Integer, the other
	 * 		can expect Integer and String
	 * 
	 * 
	 * Dynamic Polymorphism
	 * 
	 * This form of polymorphism doesn't allow the compiler to determine the executed method. The JVM needs
	 * to do it at runtime
	 * 
	 * Within the inheritance hierarchy, a subclass can override a method of its superclass. This enables
	 * developers of the subclass to customize or completely replace the behaviour of the parent / superclass.
	 * 
	 * Doing so creates a form of polymorphism. Both methods implemented by the super and subclasses share
	 * the same name and parameters. However, they provide different functionality.
	 */
	
	public static void main(String[] args) {
		Object name = new Object();
		
		GenericClass gen = new GenericClass();
		
		MethodOverloadingExample example = new MethodOverloadingExample();
		
		example.sum(0, 1);
		example.sum(1L, 55L);
		
		example.subtract(4, 1);

		
	}

}

class GenericClass{
	
	public Integer subtract(int a, int b) {
		return a - b;
	}
	
}

class MethodOverloadingExample extends GenericClass{
	
	public Integer sum(int a, int b) {
		return a + b;
	}
	
	public Long sum(long a, long b) {
		return a + b;
	}
	
	@Override
	public Integer subtract(int a, int b) {
		System.out.println("I am now subtracting");
		return a - b;
	}
}
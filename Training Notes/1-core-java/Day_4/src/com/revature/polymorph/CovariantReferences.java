package com.revature.polymorph;

public class CovariantReferences {
	
	/*
	 * Covariant reference or covariant return types referes to return types of an overriding method.
	 * It allows you to narrow down return type of an overriden method without any need to cast the type
	 * of the return type.
	 * This only wokrs for non-primitve return types.
	 * 
	 * 
	 * It helps to avoid confusing type casts present in the class hierarchy and thus makes the code 
	 * readable, usuable and maintainable
	 * We get the liberty to have more sepcific return types when overriding methods
	 * Helps preventing ClassCastException on returns
	 */
	
	public static void main(String[] args) {
		SuperClass tester = new Tester();
		Tester test = (Tester) tester.get();
	}

}

class SuperClass{
	SuperClass get() {
		System.out.println("SuperClass");
		return this;
	}
}

class Tester extends SuperClass{
	Tester get() {
		System.out.println("SubClass");
		return this;
	}
}

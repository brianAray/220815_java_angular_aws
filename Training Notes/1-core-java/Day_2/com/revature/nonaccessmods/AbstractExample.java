package com.revature.nonaccessmods;

public abstract class AbstractExample {

	/*
	 * Abstract is a modifier that is used to define methods
	 * that will be implemented in a subclass later on
	 * Most often it's used to suggest some functionality that
	 * should be implemented ina  sub class that cannot be implemented
	 * in the parent class (for whatever reason)
	 * 
	 * If a class contains an abstract method, it must also be declared abstract
	 */
	
	public abstract void implementMe();
	
	public static void main(String[] args) {
		SubAbstractClass subClass = new SubAbstractClass();
	}
}

class SubAbstractClass extends AbstractExample{

	@Override
	public void implementMe() {
		// TODO Auto-generated method stub
		System.out.println("I have been implemented in a child class");
	}
	
}

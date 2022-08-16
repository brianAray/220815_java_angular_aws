package com.revature.nonaccessmods;

public class FinalExample {

	/*
	 * The Keyword final can have three meanings
	 * 
	 * - To define a named constant
	 * - To prevent a method from being overridden
	 * - To prevent a class from being inherited
	 */
	
	public final int DONT_CHANGE_ME = 1000;
	
	public void dontUpdateMe() {
		System.out.println("DONT CHANGE ME");
	}
}

package com.revature.nonaccessmods;

public class ShadowingVariables {
	/*
	 * 
	 * Scopes and Variable Shadowing
	 * 
	 * If we have a class variable, and we want to decalre a method
	 * variable with the same name
	 */
	
	String title = "Revature";
	
	public void printTitle() {
		System.out.println(title);
		String title = "Brian";
		System.out.println(this.title);
	}
	
	public static void main(String[] args) {
		new ShadowingVariables().printTitle();
	}
	
}

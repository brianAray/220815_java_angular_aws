package com.revature.examples;

public class VariableScopes {
/*
 * Class Scope
 *
 *	Each variable decalred inside of a class's brackets {} with private
 *access modifiers but outside any method has class scope
 *
 *These varaible can be used everywhere within the class but not outside of it
 *
 *	public class ClassScope{
 *		private int amount = 0;
 *	}
 *
 *
 * Method Scope
 * 
 * When a variable is declared within a method, it has method scope
 * It will only be valid inside the same method
 */
	
	public void methodA() {
		Integer area = 2;
	}
	
	public void methodB() {
		//area = area + 2;
	}
	
	/*
	 * Loop Scope
	 * 
	 * If we declare a variable inside a loop, it will have loop scope
	 * It is only accessible within the loop
	 * 
	 */
	
	public static void main(String[] args) {
		for(int i =0; i< 10; i++) {
			Integer area = 2;
		}
	}
	
	/*
	 * Bracket Scope
	 * 
	 * We can defien additional scopes anywhere using {}
	 */
	
	{
		Integer area = 5;
	}
	

}
















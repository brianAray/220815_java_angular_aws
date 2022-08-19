package com.revature.OOP;

public class DRY {

	/*
	 * Don't Repeat Yourself (DRY) Principle
	 * 
	 * This is a common principle across multiple programing languages and paradigms
	 * (paradigm just means the type of programming, OOP, functional, proceduarl)
	 * 
	 * Every piece of knowledge or logic must have a single, unambiguous representation within the system
	 *  
	 * When you use this with OOP, this means utilizing abstract classes, interfaces, and public constants
	 * 
	 * Whenever you notice functionality common across classes, it either means that you should abstract
	 * away the commonality into a common parent class or use interfaces to couple functionality
	 * 
	 *  
	 */
}

class Animal {
	public void eatFood() {
		System.out.println("I am eating foo");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("Meow!");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Bark!");
	}
}













package com.revature.inheritance;

public class Composition {
	
	/*
	 * Composition is another fundamental part of OOP. It describes a class that references one or more
	 * objects of other classes in instance variables.
	 * This models a has-a association between objects.
	 * 
	 * Example:
	 * A car has-a engine
	 * A coffee machine has-a coffee grinder
	 * 
	 * Main benefits
	 * 
	 * It is broadly used in real life, so it is relatively conceptual for humans.
	 * 
	 * - Reuse of existing code
	 * - Design clean API
	 * - Change implementation of a class used in a composition without adapting any external clients
	 */
	
	public static void main(String[] args) {
		
		Parent person = new Parent("Greg", new Clothes("Red"));
		System.out.println(person);
		
	}
	

}


class Parent{
	String name;
	
	Clothes shirt;
	
	public Parent(String name, Clothes shirt) {
		this.name = name;
		this.shirt = shirt;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", shirt=" + shirt + "]";
	}
	
	
}

class Clothes{
	String colour;
	
	public Clothes(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Clothes [colour=" + colour + "]";
	}
	
	
}











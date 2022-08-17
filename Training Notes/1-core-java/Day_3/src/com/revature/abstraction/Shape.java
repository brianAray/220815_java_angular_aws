package com.revature.abstraction;

public abstract class Shape {
	String colour;
	
	// Abstract methods
	
	abstract double area();
	public abstract String toString();

	
	//constructor can go in abstract classes

	public Shape(String colour) {
		super();
		this.colour = colour;
	}
	
	// concrete methods can go in abstract classes
	public String getColour() {return this.colour;}
	
	
}

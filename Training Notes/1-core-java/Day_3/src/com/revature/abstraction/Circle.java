package com.revature.abstraction;

public class Circle extends Shape{
	
	double radius;

	public Circle(String colour, double radius) {
		super(colour);
		// TODO Auto-generated constructor stub
		System.out.println("Circle constructor has been called");
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle colour is: " + super.getColour() + " and area is: " + area();
	}
	
	public static void main(String[] args) {
		Circle circle = new Circle("Red", 45.3);
		System.out.println(circle);
	}

}

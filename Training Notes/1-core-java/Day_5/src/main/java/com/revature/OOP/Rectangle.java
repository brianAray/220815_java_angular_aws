package com.revature.OOP;

public class Rectangle {
	protected double a;
	protected double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
	
	public double calculateArea() {
		return a*b;
	}
	
}

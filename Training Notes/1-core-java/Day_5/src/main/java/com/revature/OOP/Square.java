package com.revature.OOP;

public class Square extends Rectangle{
	
	public Square(double a) {
		super(a, a);
	}
	
//	@Override
//	public void setA(double a) {
//		this.a = a;
//		this.b = a;
//	}
//	
//	@Override
//	public void setB(double b) {
//		this.a = b;
//		this.b = b;
//	}
//	
	public void setLength(double a) {
		this.a = a;
		this.b = a;
	}
	
}
package com.revature.models;

public class Calculator {

	public Integer add(int a, int b){
		return a + b;
	}

	public Integer subtract(int i, int j) {
		return i - j;
	}

	public Integer multiply(int i, int j) {
		// TODO Auto-generated method stub
		return i * j;
	}

	public Double divide(int i, int j) throws ArithmeticException{
		if (j == 0) {
			throw new ArithmeticException("/ by zero");
		}
		return (double) i / j;
	}
	
}

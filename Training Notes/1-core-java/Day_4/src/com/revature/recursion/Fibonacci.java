package com.revature.recursion;

public class Fibonacci {
	
	/*
	 * The Fibonacci numbers are the numebrs in the following integer sequence
	 * 
	 * 0 , 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
	 * 
	 * Mathematically:
	 * 
	 * Fn = Fn-1 + Fn-2
	 * 
	 * With seed values
	 * 
	 * F0 = 0
	 * F1 = 1
	 * 
	 * Fiven a number n, print the nth fibonacci number:
	 * 
	 * Example:
	 * 
	 * Input : n = 2
	 * Output : 1
	 * 
	 * Input : n = 9
	 * Output : 34
	 */
	
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		int n = 9;
		System.out.println(fib(n));
	}
	
	/*
	 * Recursion
	 * 
	 * A recursive algorithm calls itself with smaller input values and returns the result for the current
	 * input by carrying out basic operation on the returned value for the smaller input
	 * 
	 */
	

}

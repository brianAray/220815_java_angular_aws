package com.revature;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		// primitve data types
		// The java programming language is statically typed
		// THis means that all variables must be declared first
		// This involes stating the variables type and name
		
		// byte 
		// short
		// int
		// long
		// float
		// double
		// boolean
		// char
		
		// Primitves do not need to be instantiated like objects
		// They can be declared using literals
		
		boolean result = true;
		char capitalC = 'C'; // Make sure if you do use chars, that you use ''
		byte b = 100;
		short s = 10000;
		int i = 1_000_000;
		
		// Primitives are limited in their capabilities
		// When using complex data structures, objects are needed instead
		// This is where the Wrapper class comes in
		
		// byte = Byte
		// short = Short
		// int = Integer
		// long = Long
		// float = Float
		// double = Double
		// boolean = Boolean
		// char = Character
		
		// The wrapper class also has methods that you can use for practical purpose
		
		Integer myInt = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello, please type in your name: ");
		String name = "";
		name = sc.nextLine();
		System.out.println("Hello there " + name);
		
		
		System.out.println("How old are you?");
		
		int age;
		
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println(name + " is " + age + " years old");
	
		
	}

}

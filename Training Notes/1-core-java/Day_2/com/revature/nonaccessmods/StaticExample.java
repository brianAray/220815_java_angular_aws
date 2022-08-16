package com.revature.nonaccessmods;

public class StaticExample {
	
	public static int staticInt = 0;
	public int normalInt = 0;
	
	// We will use the constructor to keep track of how many objects are made
	
	public StaticExample() {
		staticInt++;
		normalInt++;
	}
	
//	static {
//		staticInt = -10;
//		System.out.println("HELLO THERE");
//	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 30 ; i++) {
			System.out.println("Number of normal int: " + new StaticExample().normalInt);
			System.out.println("Number of static int: " + StaticExample.staticInt);
		}
	}

}

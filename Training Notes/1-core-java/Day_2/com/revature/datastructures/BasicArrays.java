package com.revature.datastructures;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class BasicArrays {
	
	/*
	 * ARRAY
	 * 
	 * An array is a container that can hold a fixed number
	 * of items of the same type
	 * Most data structures are based around arrays
	 * Important points:
	 * 
	 * - Elements : each item is stored in an array called an element
	 * - Index : Each location of an element in an array has a numerical index, which is used
	 * to identify it
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 4;
		
		int[] quickArray = {1,2,3,4,5};
		
		int[][] multiDimensionalArray = {{1,2}, {3,4}};
		
		//System.out.println(multiDimensionalArray[0][1]);
		
		// Enhanced for loop
		
		for (int i =0; i < quickArray.length ; i++) {
			System.out.println(quickArray[i]);
		}
		
		for(int num : quickArray) {
			System.out.println(num);
		}
		
		BasicArrays basicArrays = new BasicArrays();
		basicArrays.varArgsMethod("Greg", 12,3451,5,56,23233,56234,234);
	}
	

	/*
	 * 	Variable Arguments
	 Variable arguments or VarArgs for short in Java is a method that takes a variable number
	 arguments.
	 To create a varargs method we have to use the ... operator
	 */
	
	public void varArgsMethod(String name, int...array) {
		System.out.println("HEllo there " + name);
		for (int i: array) {
			System.out.println(i);
		}
	}
	
	

}

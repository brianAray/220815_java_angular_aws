package com.revature.datastructures;

import java.util.Random;

public class DSBasics {

	/*
	 * Algorithms and Data Structures are at the heart of programming
	 * 
	 * Data Structures are methods of storing and organizing data in a computer system
	 * When data is "unstructured" , it does not have a defined data model and is not useful
	 * for operations or analysis
	 * 
	 * DS have different layouts, that are suited for different types of operations
	 * A single DS will not be the best case in every situation, and as a developer you need to
	 * be able to evaluate the situation and decide what is the best DS to use
	 * 
	 * Examples of DS:
	 * 
	 * 1 - Arrays
	 * 		Simplest data structure
	 		Collection of items stored sequentially
	 		
	 * 2 - Linked Lists
	 * 		Sequence of items that are arranged in a linear order and connected to each other
	 * 		You must access the data in order, so random access is not possible
	 * 
	 * 3 - Stacks
	 * 4 - Queues
	 * 5 - Hash Tables
	 * 6 - Trees
	 * 7 - Heaps
	 * 8 - Graphs
	 * 
	 */
	
	/*
	 * DS & A: Algorithm basics
	 * 
	 * There are about 6 different types of operations that you can apply to DS
	 * - Traversing
	 * - Searching
	 * - Insertion
	 * - Deletion
	 * - Sorting
	 * - Merging
	 * 
	 * A simple way of evaluating an algorithm and its efficiency in its operation is Big O notation
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] array = {1 , 2, 3, 4 ,56, 6};
		// Basic operations with an array
		/*
		 * Traverse
		 * Print all the elemnts of an array one by one
		 */
		for(int i: array) {
			System.out.println(i);
		}
		
		int[] emptyArray = new int[5];
		// Insertion - adds an element at the given index
		emptyArray[0] = 5;
		
		// Deletion - deletes an element at a given index
		
		// Search - Searches an element using the given index or by value
		
		// Update - Updates an element at the given index
		
		
		
		/*
		 * Array Indexing Strategies
		 * 
		 */
		
		// Get the first and last element
		// first
		System.out.println(array[0]);
		// last
		System.out.println(array[array.length - 1]);
		
		
		// Get a random value
		System.out.println(array[new Random().nextInt(array.length)]);
		
		// Append a new item to an array
		// To do this, you need to recreate the area and add in a space for the new item
		
//		int[] newArray = new int[array.length + 1];
//		int newNum = 234;
//		for(int i =0; i < newArray.length ; i++) {
//			
//			if(i > array.length) {
//				newArray[i] = newNum;
//				break;
//			}
//			newArray[i] = array[i];
//		}
		
	}
	
	
}

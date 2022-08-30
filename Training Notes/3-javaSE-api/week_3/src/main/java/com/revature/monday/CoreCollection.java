package com.revature.monday;

import java.util.Hashtable;
import java.util.Vector;

import java.util.Vector;

public class CoreCollection {
	/*
	 * Collection API is a framework
	 * 
	 * Framework : Ready made architecture, that represent a set of classes and interfaces
	 * 
	 * Collection Framework
	 * 
	 * Represents a unified architecture for storing and manipulating a group of objects
	 * 
	 * - Interfaces and implementations
	 * - Algorithms
	 * 
	 * 
	 * What is the need
	 */
	
	public void needForCollectionAPI() {
		
		// We can create an array, a vector and a hash table
		
		int arr[] = new int[] {1,2,3,4};
		
		Vector<Integer> vector = new Vector<>();
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		
		
		// add elements
		vector.addElement(1);
		vector.addElement(2);
		
		hashTable.put(1, "A");
		hashTable.put(2, "B");
		
		
		// Instantiation of these DS are different
		// arrays use []
		// vector and hashtbales require ()
		
		// Element insertion is also different
		
		// accessing elements is also different
		
		System.out.println(arr[0]);
		System.out.println(vector.elementAt(0));
		System.out.println(hashTable.get(1));

		
	}
	
	
	/*
	 * None of these collection implement a standard member access interface, making it difficult
	 * to write algorithms that can work for multiple different types of collections
	 * The vector methods are also final, so you can't extend the vector class
	 * Java devs came up with the common Collection interface to deal with this issue
	 * 
	 * Advantages
	 * 1 - Consistent API, we have the basic interface like Collection, Set, List, Map
	 * 		If a class (ArrayList, LinkedList) implements these then they have a common set of methods
	 * 
	 * 2 - Reduce programming effort, the focus is not on the DS and its design, its based on what
	 * is best for the system as a whole
	 * 
	 * 3 - Increase program speed and quality : Performance is improved by using high-performance
	 * implementations of useful data structures and algorithms
	 * 
	 */

}









package com.revature.dsa;

import java.util.LinkedList;

public class LinkedListExamples {
	
	/*
	 * Linked lists are a linear data structure, in which elements are not stored in contigous memory
	 * locations. The elemetns are linked using pointers that point to the next node in the list.
	 * 
	 * Simply, a linked list is a collection of nodes where each node has a data field and a reference
	 * to the next node
	 * 
	 * Due to the dynamic and easy nature of insertion and deletion, it is preferred over a basic Array
	 * 
	 * Disadvantages, is you cannot access a node directly, they have to be done in order
	 */
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		
		// Added elements
		ll.add("Brian");
		ll.add("Greg");
		ll.addLast("LastName");
		ll.addFirst("FirstName");
		ll.add(2, "name");
		
		System.out.println(ll);
		
		
		// Removing Elements
		
		ll.remove("Brian");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println(ll);
		
		ll.add("Brian");
		
		System.out.println(ll);

		
		// Change elements
		
		ll.set(1, "Greg");
		
		System.out.println(ll);
		
		
		// Iterating through linked list
		
		for(String item : ll) {
			System.out.println(item);
		}
	}
}

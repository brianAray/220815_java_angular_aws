package com.revature.dsa;

import java.util.List;
import java.util.Stack;

public class StackExample {
	
	/*
	 * Stacks
	 * 
	 * Stack is a linear data structure which follows a particular order in which the operations are performed
	 * 
	 * LIFO (Last in First Out)
	 * FILO (First in Last Out)
	 * 
	 * Real world example of this would be plates.
	 * 
	 * 
	 * Inside Java, we are provided the Stack class from the Collection API
	 * The class is based on the LIFO
	 * In addition to the basic push and pop operation, the class provided three more function of empty
	 * search and peek
	 * The class can also be said to extend vector and treats the class as a stack with the five mentioned
	 * functions
	 * 
	 * Iterable		- Interface
	 * |
	 * Collection	- Interface
	 * |
	 * List			- Interface
	 * |
	 * Vector		- Class
	 * |
	 * Stack 		- Class
	 * 
	 */

	public static void main(String[] args) {
		
		// Default initialization
		Stack stack1 = new Stack();
		
		// using Generics
		Stack<Integer> stack2 = new Stack<>();
		
		stack1.push("Hello");
		stack1.push(14);
		
		// Adding elements to the stack
		
		stack2.push(4);
		stack2.push(55);
		stack2.push(5555);
		
		// Accessing elements from the stack
		// Retrieve or fetch from the top of the stack, use peek()
		// The element does retrieved does not get deleted or removed from the stack
		System.out.println(stack2);
		System.out.println(stack2.peek());
		
		// Removing an elements
		// We use pop(), the element is popped from the top of the stack and removed
		
		System.out.println(stack2.pop());
		System.out.println(stack2);

		Integer thing = stack2.pop();
		
		System.out.println(stack2);
		
	}
	
}

package com.revature.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	/*
	 * ArrayList is part of the collection framework in Java. It provides us a dynamic array.
	 * 
	 * It may be slower than the standard array, but the flexibility and the ability to dynamically
	 * manipulate an array is very useful.
	 * 
	 * Sicne ArrayList is a dynamic array, you do not have to specify the size when creating it.
	 * The array will automatically increase when we dynamically add and remove items.
	 * 
	 * When you add an item to an array list and it becomes full:
	 * 
	 * - Create a bigger sized memory on heap (example, double the size)
	 * - Copy the current memory elements to the new memory
	 * - New item is added now as there is bigger memory available
	 * - Delete the old memory
	 */
	
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>(linkedList);
		
		arrayList.add(1);
		for(Integer i : arrayList) {
			System.out.println(i);
		}
		
		arrayList.remove(0);
		arrayList.get(0);
		arrayList.size();
		arrayList.contains(4);
		
	}
}

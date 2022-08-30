package com.revature.monday;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class IteratingExample {

	/*
	 * The collection framework contains multiple interfaces
	 * 
	 * Iterable Interface:
	 * The root of the entire collection framework
	 * The main functionality is to provide an iterator for the collection
	 * It only has one abstract method, that is the iterator
	 * 
	 * Iterators can be used to iterate through elements one by one
	 * It is a universal iterator so we can apply to any collection object
	 */
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		
		
		// Methods of an iterator
		// hasNext(); Returns true if the iteration has more elements
		// next(); Return the next element in the iteration
					// If no elements exist, it throws NoSuchElementException
		// remove(); Removes the next element in the iteration.
					// This method can only be called once per call to next();
		
		
		int[] integerArray = new int[] {1,2,3,4,5};
		
		for(int i : integerArray) {
			list.add(i);
			queue.add(i);
			set.add(i);
		}
		
		Iterator listItr = list.iterator();
		Iterator queueItr = queue.iterator();
		Iterator setItr = set.iterator();
		
		
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		while(queueItr.hasNext()) {
			System.out.println(queueItr.next());
		}
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
		
		
	}
}














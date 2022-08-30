package com.revature.tuesday;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	/*
	 * Consumer Interface
	 * 
	 * A function which takes 1 argument and produces some kind of result
	 * These functions don't return a value, so type generic is just T
	 * T : denotes the type of input arguments
	 * 
	 * Functions in the lambda are accept()
	 * 
	 * Consuemrs are useful when a return is not needed
	 */
	
	public static void main(String[] args) {
		
		// Consumer to printout numbers
		
		Consumer<Integer> displayIntFunction = a -> System.out.println(a);
		
		displayIntFunction.accept(10);
		
		
		
		// Consumer to multiply 2 to every integer in a list
		
		Consumer<List<Integer>> modifyList = list -> {
			for(int i = 0; i< list.size();i++) {
				list.set(i, 2* list.get(i));
			}
		};
		
		List<Integer> list = Arrays.asList(1, 44, 55, 62346, 234);
		
//		
//		System.out.println(list);
//		modifyList.accept(list);
//		System.out.println(list);

		Consumer<List<Integer>> displayList = lista -> lista.forEach(a -> System.out.println(a));
		
		modifyList.andThen(displayList).accept(list);
		
		// If at any point any of the functions has a null, then a null pointer exception will be returned
		
	}
	
	
}













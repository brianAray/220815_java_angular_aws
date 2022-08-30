package com.revature.tuesday.stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	
	/*
	 * Streams can be created from different element sources
	 * - Collections
	 * - Arrays with the help of stream() or of() methods
	 * 
	 * A stream() default method is added to the collection interface and allows creating a Stream<T> using any
	 * collection as an element source
	 */

	public void steamCreate() {

		String[] arr = new String[] {"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		
		stream = Stream.of("a", "b", "c");
	}
	
	/*
	 * There are many useful operation that can be performed on a Stream
	 * 
	 * They are divided into intermediate operations and terminal operations
	 * 
	 * Intermediate Operations - Returns Stream<T>, and allow you to chain other intermediate operations
	 * Terminal Operations - Return a result of definite Type
	 * 
	 * It's also worth noting that operations on streams don't change the source
	 */

	public void simpleExample() {
		List<Integer> list = Arrays.asList(1, 1, 22, 23, 22, 55, 234, 1234 ,3462, 6234, 33, 22, 1);
		
		long count = list.stream().distinct().count();
		
		System.out.println(count);
	}
	
	
	// Iterating
	// Helps to substitute for, for-each, and while loops, to allow concentration on operation logic
	
	public boolean iterationExampleStream() {
		
		List<String> list = Arrays.asList("1", "123", "1235", "Hello!");
		
		for (String thing: list) {
			if(thing.contains("1")) {
				return true;
			}
		}
		
		// above can be replaced with one line
		
		boolean isExist = list.stream().anyMatch(element -> element.contains("1"));
		
		return false;
	}
	
	
	/*
	 * Filtering
	 * 
	 * The filter() method allows us to pick a stream of elements that satisfy a predicate
	 */
	
	public void filterExample() {
       ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");
        // We can use the filter to remove elements in the list that contains the char 'd'
        // then using that stream, we can create a new collection that only has that
        
        System.out.println(list);

        
        Stream<String> newStream = list.stream().filter(element -> element.contains("d"));
        
        List<String> onlyDList = newStream.collect(Collectors.toList());
        
        System.out.println(onlyDList);
	}
	
	
	/*
	 * Mapping
	 * 
	 * Convert elements of a stream by applying a special function to them to collect it into a new
	 * stream. The conversion is the key part here
	 */
	
	public void simpleMapping() {
		List<String> uris = new ArrayList<>();
		
		uris.add("C://My.txt");
		
		Stream<Path> pathsStream = uris.stream().map(uri -> Paths.get(uri));
		
		/*
		 * The above code converts the List<String> into a Stream<String> and then maps it
		 * to the Stream<Path> by applying a specific lambda expression to every element of the initial stream
		 */
	}
	
	
	/*
	 * Reduction
	 * 
	 * Stream API allows reducing a sequence of elements to some value according to a specified funtion with the
	 * help of the reduce() method of the type Stream
	 * 
	 * This method takes two parameters
	 * - First value : Where you start
	 * - Second value : Accumulator Function
	 */
	
	public void reduceExample() {
		List<Integer> integers = Arrays.asList(1,1,1);
		
		Integer reduced = integers.stream().reduce(10, (a, b) -> a + b);
		
		System.out.println(reduced);
	}
	
	
	public static void main(String[] args) {
		StreamAPI sa = new StreamAPI();
		
		sa.reduceExample();
	}
	
	
}























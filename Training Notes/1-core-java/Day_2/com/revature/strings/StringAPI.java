package com.revature.strings;

public class StringAPI {
	
	/*
	 * The calss String included methods for examining individual chars
	 * for comparing string, or for searchign strings, etc
	 * 
	 * The java lnaguage provides special support for string concatenation
	 * It is using the concatenation operator (+), and for conversion
	 * of other object to strings
	 * 
	 * String concatenation is implemented using the String Builder or Buffer
	 * and its append method
	 */
	
	
	/*
	 * STRING POOL
	 * 
	 * The string pool is a storage area in the heap, where string literals are
	 * stored
	 * By default the String Pool is empty, and its maintained by the String Class
	 * 
	 * Whenever we create a string in memory, the object occupies some space in the heap
	 * Creating mulitple strings may increase the cost and memory, which can reduce performance
	 * 
	 * 
	 * The JVM performs some steps during initialization of string literals that increase performance
	 * 
	 * To decrease the number of String objects in the JVM, the string class keeps a pool of strings that
	 * it references whenever a new String is about to be initialized
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		String str = "abc";
		char a = 'a';
		char b = 'b';
		char c = 'c';
		
		char[] longChar = {a, b, c};
		
		str.charAt(0);
		
		/*
		 * Java proivides three classes to represent a character sequence
		 * 
		 * String
		 * StringBuilder
		 * StringBuffer
		 * 
		 * 
		 */
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" There");
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" There Again");
		System.out.println(builder);
		
		long startTime = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			buffer.append("+");
		}
		System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	
		long startTime2 = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			builder.append("+");
		}
		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime2) + "ms");

	}
}














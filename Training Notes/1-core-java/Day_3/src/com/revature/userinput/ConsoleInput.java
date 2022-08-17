package com.revature.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		
		/*
		 * Scanner Class
		 * 
		 * Most preferred way to take in input, the main purpose is to parse primitive types and strings
		 * However, it is also used to read input from the user in the command line
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type something please");
				
		String userInput = sc.nextLine();
		
		System.out.println(userInput);
		
		
		/*
		 * BufferedReader Class
		 * 
		 * This java classical method to take input, introduced in JDK 1.0
		 * The method is used by wrapping the System.in in an InputStreamReader which is then wrapped
		 * around a BufferedReader
		 */
		
		System.out.println("Type your name");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name;
		try {
			name = br.readLine();
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		/*
		 * Console Class
		 * 
		 * It is currently the more preferred way to read from the console
		 * It can be used for password reading like input, without echoing the characters entered
		 * by the user
		 */
		
		//System.out.println("Type your name againe");
		
//		System.out.println();
//		
//		String name3 = System.console().readLine();
//		
//		System.out.println(name3);
//		

	}
	
}

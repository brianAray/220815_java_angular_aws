package com.revature.basic;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.revature.customexceptions.NegativeAgeingException;

public class ExceptionsErrorsExample {

	/*
	 * In Java, both Errors and Exceptions are subclasses of the Throwable Class
	 * 
	 * 									Object
	 * 									   |
	 * 									Throwable
	 * 									 /		\
	 * 									/		 \
	 * 						   Exceptions		Errors
	 */
	
	/*
	 * Error refers to an illegal operation performed by the user which results
	 * in abnormal working of the program
	 * 
	 * Types:
	 * - Compile-time
	 * - Run-time
	 * - Logical
	 * 
	 * Programming errors are often undetected until the program is compiled
	 * or executed
	 * 
	 * Whereas exceptions in Java refer to an unwanted or unexpected event
	 * This occurs during the execution of a program (run time) that disrupts
	 * the natural flow of the programs instructions
	 * 
	 * 
	 * Types of Errors
	 * - Assertion Error
	 * - ThreadDeath
	 * - Virtual Machine Error
	 * 		- Out of Memory Error
	 * 		- Stack Overflow Error
	 * 		- Unknown Error
	 * 
	 * 
	 * Types of Exceptions
	 * - IOExceptions
	 * - RuntimeExceptions
	 * - InterruptedExceptions
	 */
	
	public void writeToFile() {
		try (
				BufferedWriter bw = new BufferedWriter(new FileWriter(
						"sc/com/revature/basic/myFile.txt"))
				){
			
			bw.write("Test");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			System.out.println("It broke");
		} finally {
			System.out.println("Hello this is in a finally block");
		}
		
//		BufferedWriter bwr = null;
//		
//		try {
//			bwr = new BufferedWriter(new FileWriter("src/com/revature/basic/myFile.txt"));
//			bwr.write("Hello");
//		}catch(IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bwr.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	
	public static void main(String[] args) {
		ExceptionsErrorsExample example = new ExceptionsErrorsExample();
		
		example.writeToFile();
	}
	
	
}

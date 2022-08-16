package com.revature;

public class ControlFlows {
	
	public static void main(String[] args) {
		// A typical java program starts from the main 
		// thread declaration in the class and works line by line down
		// If you want to change the flow from the default top to bottom
		// use control flow statements
		
		// Examples
		// If - Then
		// If - Then - Else
		// Switch
		// While
		// Do - While
		// For
		// Enhanced For
		
		
		// If - Then
		// If (Statement to be evaluated)
		// 		Do thing
		
		if(true) {
			System.out.println("This will always be true");
		}
		
		if(false) {
			System.out.println("THis will never print out");
		}else {
			System.out.println("This pritns out instead");
		}
		
		if(1 + 1 > 5) {
			System.out.println("1 + 1 is > 5");
		} else if(1 + 1 < 5) {
			System.out.println("1 + 1 is < 5");
		} else {
			System.out.println("Will this print?");
		}
		
		
		// Switch blocks are effectively if else blocks just
		// written in a easier to read fashion
		// Typically used when you are evaluating the same variable
		// in the same block but changing the action based on it
		
		int month = 8;
		
		String monthString = "";
		
		switch (month) {
		case 1: monthString = "January";
				break;
		case 2: monthString = "February";
				break;
		case 3: monthString = "March";
				break;
		case 4: monthString = "April";
				break;
		case 5: monthString = "May";
				break;
		case 6: monthString = "June";
				break;
		case 7: monthString = "July";
				break;
		case 8: monthString = "August";
				break;
		case 9: monthString = "September";
				break;
		case 10: monthString = "October";
				break;
		default:
				System.out.println("Choose a valid month number");
				break;
		}
		
		System.out.println("It is the month of " + monthString);
		
		
		// while loops
		// while (statement evaluated){
	// 			do thing
		// }
		
		int num = 1;
		
		while(num < 100) {
			num++;
			System.out.println(num);
		}
		
		// do while loop
		// do while has the statement on top
		
		int count = 6;
		
		do {
			System.out.println("Count is " + count);
			count++;
		} while(count < 50);
		
		// for statements
		// for (initialization ; termination ; increment){
		// 	statement
		// }
		
		for (int i = 10; i > 0 ; i--) {
			System.out.println(i);
		}
		
		
	}
}

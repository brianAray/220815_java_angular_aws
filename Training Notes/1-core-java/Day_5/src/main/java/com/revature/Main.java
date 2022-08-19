package com.revature;

import java.util.LinkedList;
import java.util.List;

import com.revature.OOP.Rectangle;
import com.revature.OOP.Square;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Inside square I am using the setters to set both a and b. So when it is initialized then we just need to
		 * pass in a single variable.
		 */

		Rectangle rec = new Square(5);
		
		// Lets say another developer is using rec, and is not aware of how I have overridden the setters
		// They then attempt to change the values of a and b assuming it is a rectangle
		
		rec.setA(6);
		rec.setB(10);
		
		System.out.println(rec.calculateArea());
		
		List<String> list = new LinkedList<>();

	}

}

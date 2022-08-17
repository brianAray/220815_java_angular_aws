package com.revature.basic;

import java.util.Objects;

public class ObjectClass {

	/*
	 * The object class is present in java.lang package
	 * Every clas in java is directly or indirectly derived from the Object class
	 * If a class does not extend any other class, then it is a direct child of
	 * Object
	 * 
	 * The Object class methods are therefore available Java classes
	 * 
	 * 
	 */
	
	private int number;

	public ObjectClass(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	/*
	 *  HashCode
	 *  For every object, the JVM generates a unique number which is the HashCode
	 *  It returns distinct integers for distinct objects
	 *  A common misconception is that this method reutrns the address of the object
	 *  
	 *  It converts the internal address of the object to an integer using an algorithm
	 *  The hashCode() method is native to Java and it is impossible to find the address
	 *  of the object, so it uses native languages like C/C++ to find the
	 *  address of the object
	 * 
	 */
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClass other = (ObjectClass) obj;
		return number == other.number;
	}

	@Override
	public String toString() {
		return "ObjectClass [number=" + number + "]";
	}
	
	
}

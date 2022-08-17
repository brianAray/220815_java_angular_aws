package com.revature.customexceptions;

import java.util.Objects;

import com.revature.basic.ExceptionsErrorsExample;

public class Human {
	
	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
	/*
	 * Exception Propagation
	 * 
	 * If you don't handle an exception within a method, it will be propagated
	 * up within the call stack.
	 * If it is a checked exception, you will also need to specify that the method
	 * might throw an exception
	 * 
	 * 
	 */
	
	public void ageing(int ageing) throws NegativeAgeingException{
		if(ageing <= 0) {
			throw new NegativeAgeingException("Ageing is less than or = 0");
		}
		this.age += ageing;
	}
	
	public void updateName(String name) throws WeirdNameException{
		if(name.equals("1234")){
			throw new WeirdNameException(name + " is a weird name");
		}
		setName(name);
	}
	
	/*
	 * Need for Custom Exceptions
	 * 
	 * Java Exceptions cover almost all general exeptions that are bound
	 * to happen when programming.
	 * However, we sometimes need to supplement these statndard exceptions
	 * with our own
	 * For example:
	 * - Business Logic : Exceptions that are specific to our buisness logic
	 * 					  and work flow. THese help the application users and or
	 * 					  the developers understand the exact problem occurring
	 * 
	 * - To catch and provide specific treatment of existing java exceptions
	 */
	
	public static void main(String[] args) {
		Human Greg = new Human("Greg", 55);
		
		try {
			
			Greg.ageing(-10);
			
		} catch (NegativeAgeingException e) {
			e.printStackTrace();
		}
		
		System.out.println(Greg);
		
		Greg.updateName("1234");
		
		System.out.println(Greg);

	}

}

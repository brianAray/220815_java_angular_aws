package com.revature.models;

import com.revature.ExampleInterface;

public class Bicycle implements ExampleInterface{
	
	// Field members are defined below the class name
	// This is just an accepted standard
	
	// Access modifiers define what object has access to what
	
	// Public, Protected, Private, Default
	
	private int wheels = 2;
	private int age;
	private String colour;
	protected int speed = 0;
	
	
	// Below is the constructor for the class
	public Bicycle(int age, String colour) {
		this.age = age;
		this.colour = colour;
	}
	
	// The bicycle will have two methods
	
	public void peddle(int speedIncrement) {
		//this.speed = this.speed + speedIncrement;
		this.speed += speedIncrement;
	}
	
	public void applyBrake(int speedDecrement) {
		// check to see if lowering the speed will bring
		// it to 0, if it is below 0, set it to 0
		
		if(this.speed <= speedDecrement) {
			this.speed = 0;
		}else {
			this.speed -= speedDecrement;
		}
		
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		if(wheels > 2) {
			// Don't make the wheels greater than 2
			// Make it a different vehicle
			return;
		}
		this.wheels = wheels;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void brake(int force) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repair() {
		// TODO Auto-generated method stub
		
	}
	
	
}
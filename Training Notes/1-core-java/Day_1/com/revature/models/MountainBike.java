package com.revature.models;
public class MountainBike extends Bicycle{

	public int seatHeight;
	
	public MountainBike(int age, String colour, int seatHeight) {
		super(age, colour);
		this.seatHeight = seatHeight;
	}
	
	public void goUpHill() {
		this.speed /= 2;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	
}

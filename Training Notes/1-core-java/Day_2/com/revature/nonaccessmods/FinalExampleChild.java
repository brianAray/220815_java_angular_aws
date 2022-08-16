package com.revature.models;

public class FinalExampleChild extends FinalExample{

	@Override
	public void dontUpdateMe() {
		System.out.println("I have been overriden");
	}
}

package com.revature.wednesday;

public class NewThread extends Thread {

	public void run() {
		System.out.println("Hello from " + this.getName());
	}
}

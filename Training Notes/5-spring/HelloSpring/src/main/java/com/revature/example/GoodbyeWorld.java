package com.revature.example;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeWorld {
	
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}

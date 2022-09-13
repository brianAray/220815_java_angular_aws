package com.revature;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	private MessageMaker messageMaker;

	public void getMessage() {
		System.out.println("Your Message: " + messageMaker.getMessage());
	}

	public MessageMaker getMessageMaker() {
		return messageMaker;
	}

	public void setMessageMaker(MessageMaker messageMaker) {
		this.messageMaker = messageMaker;
	}
	
	

}

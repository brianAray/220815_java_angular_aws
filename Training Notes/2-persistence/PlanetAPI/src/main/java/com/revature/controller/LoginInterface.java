package com.revature.controller;

import com.revature.services.models.User;

public interface LoginInterface {
	
	// Validate user input
	
	void login();
	
	User validateLogin(String username, String password);

}

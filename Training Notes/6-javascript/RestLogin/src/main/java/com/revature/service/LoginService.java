package com.revature.service;

import org.springframework.stereotype.Service;

import com.revature.model.User;
import com.revature.util.UserNotFoundException;

@Service
public class LoginService {

	public User login(User user) throws UserNotFoundException{
		// Make a call to database to see if username is there and password matches
		if(user.getUsername().equals("user") && user.getPassword().equals("pass")) {
			return new User(1, user.getUsername(), user.getPassword());
		}else {
			throw new UserNotFoundException("User Not Found");
		}
	}

	
}

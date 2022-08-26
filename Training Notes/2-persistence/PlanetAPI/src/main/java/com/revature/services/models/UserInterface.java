package com.revature.services.models;

import com.revature.repository.exceptions.UserNotFoundException;

public interface UserInterface {
	
	User login(String username, String password) throws UserNotFoundException;
	
	boolean logout();
	
	boolean deleteUser();
	
	boolean updateUser(User updatedUser);

}

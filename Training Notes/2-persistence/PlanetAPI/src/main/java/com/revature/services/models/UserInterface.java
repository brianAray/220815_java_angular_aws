package com.revature.services.models;

public interface UserInterface {
	
	User login(String username, String password);
	
	boolean logout();
	
	boolean deleteUser();
	
	boolean updateUser(User updatedUser);

}

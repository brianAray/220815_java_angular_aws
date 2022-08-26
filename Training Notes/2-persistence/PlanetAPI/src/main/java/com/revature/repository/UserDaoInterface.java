package com.revature.repository;

import com.revature.repository.DTO.UserDTO;
import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.models.User;

public interface UserDaoInterface {
	
	// CRUD
	// CREATE
	
	User createUser(User newUser);
	
	// READ
	
	User getUser(String username, String password) throws UserNotFoundException;
	
	
	// UPDATE
	
	User updateUser(User updatedUser);
	
	// DELETE
	
	boolean deleteUser(User user);

	User selectUserById(Integer userId);

}

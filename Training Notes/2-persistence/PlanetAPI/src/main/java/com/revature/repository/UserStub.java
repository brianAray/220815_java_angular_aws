package com.revature.repository;

import java.util.HashMap;
import java.util.Map;

import com.revature.services.models.Customer;
import com.revature.services.models.User;

public class UserStub implements UserDaoInterface{
	
	public Map<String, User> userData;
	
	public UserStub() {
		userData = new HashMap<>();
		userData.put("user1", new Customer("user1", "pass1", "email1@email.com"));
		userData.put("user2", new Customer("user2", "pass2", "email2@email.com"));
		userData.put("user3", new Customer("user3", "pass3", "email3@email.com"));
		userData.put("user4", new Customer("user4", "pass4", "email4@email.com"));
	}
	

	@Override
	public User createUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		
		if (userData.containsKey(username) && userData.get(username).getPassword().equals(password)) {
			return userData.get(username);
		}
		
		return null;
	}

	@Override
	public User updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	


}

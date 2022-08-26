package com.revature.services;

import com.revature.repository.UserDaoInterface;
import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.models.Customer;
import com.revature.services.models.User;

public class UserService {
	
	private UserDaoInterface userDao;
	
	public UserService(UserDaoInterface userDao) {
		this.userDao = userDao;
	}
	

	public Customer getCustomer(String username, String password) throws UserNotFoundException {
		return convertUserDtoToCustomer(userDao.getUser(username, password));
	}


	private Customer convertUserDtoToCustomer(User user) {
		return new Customer(user.getUserId(), user.getUsername(), user.getPassword(), user.getEmail(), user.getBalance());
	}

}

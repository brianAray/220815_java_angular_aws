package com.revature.services;

import com.revature.repository.UserDaoInterface;
import com.revature.services.models.User;
import com.revature.services.models.UserInterface;

public class LoginService implements UserInterface{
	
	private UserDaoInterface userDao;
	
	public LoginService(UserDaoInterface userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User login(String username, String password) {
		return userDao.getUser(username, password);	
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User updatedUser) {
		// TODO Auto-generated method stub
		return false;
	}

}

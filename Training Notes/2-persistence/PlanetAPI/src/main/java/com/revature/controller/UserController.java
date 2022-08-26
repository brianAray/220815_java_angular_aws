package com.revature.controller;

import java.util.Scanner;

import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.LoginService;
import com.revature.services.models.User;

public class UserController implements UserInputInterface, LoginInterface{
	
	private Scanner sc;
	private LoginService loginService;
	
	public UserController(Scanner sc, LoginService loginService) {
		super();
		this.sc = sc;
		this.loginService = loginService;
	}

	@Override
	public User validateLogin(String username, String password) {
		
		if(username == null && password == null) {
			return null;
		}
		
		User user = null;
		try {
			user = loginService.login(username, password);
		} catch (UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public String getUserInput() {
		System.out.println("Hello please input something!");
		return sc.nextLine();
	}

	@Override
	public void login() {
		System.out.println("Please login by typing your username and password \n");
		String username = getUserInput();
		String password = getUserInput();
		User user = validateLogin(username, password);
		
		if(user != null) {
			System.out.println("Successful login!");
			System.out.println(user);
		}else {
			System.out.println("Failed login!");
		}
	}

}

package com.revature;

import java.util.Scanner;

import com.revature.controller.UserController;
import com.revature.repository.UserDao;
import com.revature.repository.UserDaoInterface;
import com.revature.services.LoginService;

public class Driver {
	
	public static void main(String[] args) {
		UserDaoInterface uDao = new UserDao();
		LoginService loginService = new LoginService(uDao);
		UserController userController = new UserController(new Scanner(System.in), loginService);
		
		userController.login();
	}

}

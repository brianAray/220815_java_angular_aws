package com.revature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Login;
import com.revature.repository.LoginRepository;
import com.revature.util.UserNotFoundException;

@Service
public class LoginService {
	
	private LoginRepository loginRepository;
	
	@Autowired
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	public Login login(Login user) throws UserNotFoundException{
		// Make a call to database to see if username is there and password matches
		
		Optional<Login> login = loginRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		if(login.isPresent()) {
			return login.get();
		}else {
			throw new UserNotFoundException("User Not Found");
		}
	}

	
}

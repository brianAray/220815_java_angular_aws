package com.revature.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.services.models.Customer;
import com.revature.services.models.User;

public class UserDao implements UserDaoInterface{
	
	Logger consoleLogger;
	Logger fileLogger;
	
	public UserDao() {
		consoleLogger = LoggerFactory.getLogger("consoleLogger");
		fileLogger = LoggerFactory.getLogger("fileLogger");
	}

	@Override
	public User createUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		
		consoleLogger.debug("Getting user with username: " + username);
		fileLogger.debug("Get User from Database");
		User user = null;
		
		final String sql = "SELEC * FROM users WHERE username = '"+username+"';";
		
		try (Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://java-angular-82322.cvmncwswsek7.us-east-2.rds.amazonaws.com:5432/postgres", 
				"postgres", 
				"password123");
			Statement statement = connection.createStatement();)
		{
			ResultSet set = statement.executeQuery(sql);
			
			if(set.next()) {
				user = new Customer(
						set.getString(2),
						set.getString(3),
						set.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			consoleLogger.error(e.getMessage());
			fileLogger.error(e.toString());
		}
		
		return user;
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

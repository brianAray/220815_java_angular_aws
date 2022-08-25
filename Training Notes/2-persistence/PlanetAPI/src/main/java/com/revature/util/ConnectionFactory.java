package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	/*
	 * Because we don't want to write the same code several times throughout our app
	 * We will create a utility class for grabbing connections to our database easily
	 */
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(
				"jdbc:postgresql://java-angular-82322.cvmncwswsek7.us-east-2.rds.amazonaws.com:5432/postgres",
				"postgres",
				"password123");
		
	}

}

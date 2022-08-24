package com.revature.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.repository.DTO.PlanetDTO;
import com.revature.services.models.Customer;
import com.revature.services.models.Planet;
import com.revature.services.models.User;
import com.revature.util.ConnectionFactory;

public class PlanetDao implements PlanetDaoInterface{
	
	
	Logger consoleLogger;
	Logger fileLogger;
	
	public PlanetDao() {
		consoleLogger = LoggerFactory.getLogger("consoleLogger");
		fileLogger = LoggerFactory.getLogger("fileLogger");
	}
	
	public static void main(String[] args) {
		PlanetDao pDao = new PlanetDao();
		System.out.println(pDao.selectPlanetById(1));
	}

	@Override
	public PlanetDTO selectPlanetById(Integer planetId) {
		consoleLogger.debug("Getting user with planet with id: " + planetId);
		fileLogger.debug("Get planet from Database with planet_id");
		
		PlanetDTO planet = null;
		
		final String sql = "SELECT * FROM planets WHERE planet_id = '"+planetId+"';";
		
		try (Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();)
		{
			ResultSet set = statement.executeQuery(sql);
			
			if(set.next()) {
				planet = new PlanetDTO(
						set.getInt(1),
						set.getString(2),
						set.getInt(3),
						set.getInt(4),
						set.getInt(5),
						set.getInt(6)		
						);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			consoleLogger.error(e.getMessage());
			fileLogger.error(e.toString());
		}
		
		return planet;
	}

}

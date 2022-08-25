package com.revature.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.repository.DTO.PlanetDTO;
import com.revature.services.models.CelestialBody;
import com.revature.services.models.Moon;
import com.revature.util.ConnectionFactory;

public class MoonDao implements MoonDaoInterface{
	
	Logger consoleLogger;
	Logger fileLogger;
	
	public MoonDao() {
		consoleLogger = LoggerFactory.getLogger("consoleLogger");
		fileLogger = LoggerFactory.getLogger("fileLogger");
	}

	public List<CelestialBody> getMoonsByPlanetId(Integer planetId) {
		consoleLogger.debug("Getting moons with planet id: " + planetId);
		fileLogger.debug("Get moons from Database with planet_id");
		
		List<CelestialBody> moons = new LinkedList<>();
		
		final String sql = "SELECT * FROM moons WHERE planet_id = '"+planetId+"';";
		
		try (Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();)
		{
			ResultSet set = statement.executeQuery(sql);
			
			while(set.next()) {
				moons.add(
						new Moon(
								set.getString(1)
								)
						);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			consoleLogger.error(e.getMessage());
			fileLogger.error(e.toString());
		}
	
		return moons;
	}

}

package com.revature.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.services.models.CelestialBody;
import com.revature.services.models.Moon;
import com.revature.services.models.Species;
import com.revature.util.ConnectionFactory;

public class SpeciesDao implements SpeciesDaoInterface{
	
	Logger consoleLogger;
	Logger fileLogger;
	
	public SpeciesDao() {
		consoleLogger = LoggerFactory.getLogger("consoleLogger");
		fileLogger = LoggerFactory.getLogger("fileLogger");
	}

	@Override
	public List<Species> getSpeciesByPlanetId(Integer planetId) {
		consoleLogger.debug("Getting species with planet id: " + planetId);
		fileLogger.debug("Get species from Database with planet_id");
		
		List<Species> species = new LinkedList<>();
		
		final String sql = "SELECT * FROM species_planet WHERE planet_id = '"+planetId+"';";
		
		try (Connection connection = ConnectionFactory.getConnection();
			Statement statement = connection.createStatement();)
		{
			ResultSet set = statement.executeQuery(sql);
			
			while(set.next()) {
				species.add(
						new Species(
								set.getString(2),
								set.getInt(3)
								)
						);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			consoleLogger.error(e.getMessage());
			fileLogger.error(e.toString());
		}
	
		return species;
	}

}

package com.revature.repository;

import com.revature.repository.DTO.PlanetDTO;
import com.revature.services.models.Planet;

public interface PlanetDaoInterface {
	
	// CRUD
	
	PlanetDTO selectPlanetById(Integer planetId);

}

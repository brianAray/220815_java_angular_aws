package com.revature.repository;

import com.revature.repository.DTO.PlanetDTO;
import com.revature.repository.DTO.UserDTO;
import com.revature.services.models.Customer;
import com.revature.services.models.Planet;

public interface PlanetDaoInterface {
	
	// CRUD
	
	PlanetDTO selectPlanetById(Integer planetId);

	void updatePlanetOwner(PlanetDTO planet, UserDTO customer);

}

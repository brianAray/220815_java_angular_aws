package com.revature.repository;

import java.util.List;

import com.revature.services.models.CelestialBody;

public interface MoonDaoInterface {
	
	// crud
	
	List<CelestialBody> getMoonsByPlanetId(Integer planetId);

}

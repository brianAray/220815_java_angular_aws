package com.revature.repository;

import java.util.List;

import com.revature.services.models.Species;

public interface SpeciesDaoInterface {
	
	//read
	
	List<Species> getSpeciesByPlanetId(Integer planetId);

}

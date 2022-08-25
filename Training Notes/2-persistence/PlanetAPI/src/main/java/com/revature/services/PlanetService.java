package com.revature.services;

import com.revature.repository.MoonDaoInterface;
import com.revature.repository.SpeciesDaoInterface;
import com.revature.repository.DTO.PlanetDTO;
import com.revature.services.models.Planet;

public class PlanetService implements PlanetServiceInterface{

	private MoonDaoInterface moonDao;
	private SpeciesDaoInterface speciesDao;
	
	public PlanetService(MoonDaoInterface moonDao, SpeciesDaoInterface speciesDao) {
		this.moonDao = moonDao;
		this.speciesDao = speciesDao;
	}
	
	@Override
	public Planet convertPlanetDto(PlanetDTO planetDto) {
		return new Planet(
				planetDto.getName(),
				planetDto.getPlanet_id(),
				planetDto.getWeight(),
				planetDto.getValue(),
				moonDao.getMoonsByPlanetId(planetDto.getPlanet_id()),
				speciesDao.getSpeciesByPlanetId(planetDto.getPlanet_id())
				);
	}

}

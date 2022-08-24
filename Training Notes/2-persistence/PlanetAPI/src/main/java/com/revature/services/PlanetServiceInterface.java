package com.revature.services;

import com.revature.repository.DTO.PlanetDTO;
import com.revature.services.models.Planet;

public interface PlanetServiceInterface {

	Planet convertPlanetDto(PlanetDTO planetDto);
}

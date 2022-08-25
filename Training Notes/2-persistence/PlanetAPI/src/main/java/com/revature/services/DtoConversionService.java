package com.revature.services;

import com.revature.repository.PlanetDaoInterface;
import com.revature.repository.UserDaoInterface;
import com.revature.repository.DTO.PlanetDTO;
import com.revature.repository.DTO.UserDTO;
import com.revature.services.models.Customer;
import com.revature.services.models.Planet;
import com.revature.services.models.User;

public class DtoConversionService {
	
	private PlanetDaoInterface pDao;
	private UserDaoInterface uDao;
	
	

	public DtoConversionService(PlanetDaoInterface pDao, UserDaoInterface uDao) {
		super();
		this.pDao = pDao;
		this.uDao = uDao;
	}

	public PlanetDTO convertPlanetToPlanetDto(Planet planet) {
		return pDao.selectPlanetById(planet.getPlanetId());
	}

	public UserDTO convertUserToUserDto(Customer customer) {
		User user = uDao.selectUserById(customer.getUserId());
		
		return new UserDTO(
				user.getUserId(),
				user.getUsername(),
				user.getPassword(),
				user.getEmail(),
				user.getBalance()
				);
	}

}

package com.revature.services.market;

import com.revature.repository.MoonDao;
import com.revature.repository.PlanetDao;
import com.revature.repository.PlanetDaoInterface;
import com.revature.repository.SpeciesDao;
import com.revature.repository.UserDao;
import com.revature.services.DtoConversionService;
import com.revature.services.LoginService;
import com.revature.services.PlanetService;
import com.revature.services.UserService;
import com.revature.services.models.Customer;
import com.revature.services.models.Planet;

public class BuyingService implements BuyingInterface{
	
	private PlanetDaoInterface planetDao;
	private DtoConversionService dtoConversionService;
	
	public BuyingService(PlanetDaoInterface planetDao, DtoConversionService dtoConversionService) {
		this.planetDao = planetDao;
		this.dtoConversionService = dtoConversionService;
	}
	
	public static void main(String[] args) {
		
		UserDao uDao = new UserDao();
		
		PlanetDao pDao = new PlanetDao();
		LoginService lS = new LoginService(uDao);
		
		UserService uS = new UserService(uDao);
		
		PlanetService pS = new PlanetService(new MoonDao(), new SpeciesDao());
		
		BuyingService bS = new BuyingService(pDao, new DtoConversionService(pDao, uDao));
		bS.buyPlanet(pS.convertPlanetDto(pDao.selectPlanetById(1)), uS.getCustomer("user1", "pass1"));
		
	}
	

	public boolean buyPlanet(Planet planet, Customer customer) {
		//Check to see if user has enough money
		// If they do then set user ownership of planet in inventory
		// if not, then show fail to user and return
		
		if(customer.getBalance() < planet.getValue()) {
			System.out.println("You don't have enough!");
			return false;
		}else {
			System.out.println("You have bought it!");
			System.out.println(planet);
			
			planetDao.updatePlanetOwner(
					dtoConversionService.convertPlanetToPlanetDto(planet), 
					dtoConversionService.convertUserToUserDto(customer));
			
			return true;
		}
	}

}

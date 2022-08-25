package com.revature.services.market;

import com.revature.services.models.Customer;
import com.revature.services.models.Planet;

public interface BuyingInterface {
	
	boolean buyPlanet(Planet planet, Customer customer);

}

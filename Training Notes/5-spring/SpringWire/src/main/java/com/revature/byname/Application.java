package com.revature.byname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {

	private ApplicationUser applicationUser;

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}

	// Setter Injection
	@Autowired
	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationUser=" + applicationUser + "]";
	}

	
}

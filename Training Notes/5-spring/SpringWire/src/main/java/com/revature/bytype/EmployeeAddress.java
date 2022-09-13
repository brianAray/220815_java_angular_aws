package com.revature.bytype;

import org.springframework.stereotype.Component;

@Component
public class EmployeeAddress {

	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "EmployeeAddress [street=" + street + ", city=" + city + "]";
	}
	
	
}

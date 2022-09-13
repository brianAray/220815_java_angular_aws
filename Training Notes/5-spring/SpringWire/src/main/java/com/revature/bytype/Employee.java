package com.revature.bytype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	// Field Injection
	//@Autowired
	private EmployeeAddress address;

	public EmployeeAddress getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}

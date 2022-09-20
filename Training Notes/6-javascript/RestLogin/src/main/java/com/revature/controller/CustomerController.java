package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Customer;
import com.revature.service.CustomerService;
import com.revature.util.CustomerNotFoundException;

@RestController
@RequestMapping("/customer")
@CrossOrigin("*")
public class CustomerController {

	private CustomerService customerService;
	
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable("id") Integer id) throws CustomerNotFoundException{
		return customerService.getCustomer(id);
	}
}

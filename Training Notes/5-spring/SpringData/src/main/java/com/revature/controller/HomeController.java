package com.revature.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.repository.entity.Customer;
import com.revature.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class HomeController {
	
	private CustomerService customerService;
	
	@Autowired
	public HomeController(CustomerService customerService) {
		this.customerService = customerService;
	}
	

	@PostMapping(
			value = "/new",
			consumes = {MediaType.APPLICATION_JSON_VALUE},
			produces = {MediaType.APPLICATION_JSON_VALUE}
			)
	public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer){
		Customer persistedCustomer = customerService.save(customer);
		return new ResponseEntity<>(persistedCustomer, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable("id") Long id){
		Optional<Customer> customer = customerService.findById(id);
		return customer.isPresent() ? ResponseEntity.ok(customer.get()) : null;
	}
	
	@GetMapping("/name")
	public ResponseEntity<?> getCustomerByName(@RequestParam("name") String name){
		Optional<Customer> customer = customerService.findByFirstName(name);
		return customer.isPresent() ? ResponseEntity.ok(customer.get()) : null;
	}
	
	@GetMapping("/check")
	public ResponseEntity<Boolean> isCustomerExist(@RequestParam("id") Long id){
		
		return new ResponseEntity<>(customerService.isExists(id), HttpStatus.OK);
	}
}

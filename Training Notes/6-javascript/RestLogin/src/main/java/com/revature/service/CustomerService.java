package com.revature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Customer;
import com.revature.repository.CustomerRepository;
import com.revature.util.CustomerNotFoundException;

@Service
public class CustomerService {
	
	private CustomerRepository customerRepository;
	
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public Customer getCustomer(Integer id) throws CustomerNotFoundException{
		Optional<Customer> customer = customerRepository.findById(id);
		
		if(customer.isPresent()) {
			return customer.get();
		}else {
			throw new CustomerNotFoundException("Customer not found");
		}
	}

	
}

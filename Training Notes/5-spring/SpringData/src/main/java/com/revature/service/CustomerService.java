package com.revature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.CustomerRepository;
import com.revature.repository.entity.Customer;

@Service
public class CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Optional<Customer> findById(Long id) {
		return customerRepository.findById(id);
	}
	
	public Optional<Customer> findByFirstName(String firstName) {
		return customerRepository.findByFirstname(firstName);
	}
	
	public boolean isExists(Long id) {
		return customerRepository.isCustomerExistsById(id);
	}

}

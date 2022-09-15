package com.revature.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.revature.repository.CustomerRepository;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

	@Mock
	private CustomerRepository customerRepository;
	
	private CustomerService customerService;
	
	@BeforeEach
	void setup() {
		this.customerService = new CustomerService(this.customerRepository);
	}
	
	@Test
	void findById() {
		customerService.findById(1L);
		verify(customerRepository).findById(1L);
	}
}

package com.revature.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.repository.entity.Customer;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test
	void isCustomerExistsById() {
		Customer customer = new Customer(1001L, "Mike", "Jones");
		customerRepository.save(customer);
		
		Boolean actualResult = customerRepository.isCustomerExistsById(customer.getId());
		
		assertThat(actualResult).isTrue();
	}
}

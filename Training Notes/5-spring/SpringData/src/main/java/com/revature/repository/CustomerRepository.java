package com.revature.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.repository.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Optional<Customer> findById(Long id);
	
	Optional<Customer> findByFirstname(String firstName);
	
	@Query(
			"SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Customer c WHERE c.id = :personId")
	Boolean isCustomerExistsById(@Param("personId")Long personId);
}

package com.revature.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.repository.exceptions.UserNotFoundException;
import com.revature.services.models.Customer;
import com.revature.services.models.User;

// This means you do not have to instantiate the class in order to run tests
// It runs tests statically
@TestInstance(Lifecycle.PER_CLASS)
public class UserDaoTest {

	@Mock
	private UserDaoInterface uDao;
	
	private User validCustomer;
	
	@BeforeAll
	void setup() {
		MockitoAnnotations.openMocks(this);
		
		validCustomer = new Customer(1, "username", "password", "email@email.com", 10000);
		
	}
	
	@Test
	public void getUserWithCorrectUsernameTest() throws UserNotFoundException {
		Mockito.when(uDao.getUser(validCustomer.getUsername(), validCustomer.getPassword())).thenReturn(validCustomer);
		
		assertEquals(validCustomer, uDao.getUser("username", "password"));
		
	}
	
	@Test
	public void getUserWithIncorrectUsernameTest() throws UserNotFoundException {
		Mockito.when(uDao.getUser("InvalidUsername", "password")).thenThrow(UserNotFoundException.class);
		assertThrows(UserNotFoundException.class, () -> uDao.getUser("InvalidUsername", "password"));
	}
	
}

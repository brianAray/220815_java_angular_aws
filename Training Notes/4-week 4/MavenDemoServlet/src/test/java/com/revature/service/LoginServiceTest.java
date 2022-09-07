package com.revature.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginServiceTest {
	
	private LoginService loginService = new LoginService();
	

	@Test
	public void simpleAdditionTest() {
		assertEquals(1, loginService.add(0, 1));
	}

}

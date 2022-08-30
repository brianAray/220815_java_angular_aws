package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.revature.models.Calculator;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JunitExampleTest {
	
	/*
	 * What is JUnit
	 * 
	 * Junit is a unit testing framework for Java
	 * It plays a crucial role in TDD (Test Driven Development) and is a family of unit testing frameworks
	 * collectively known as xUnit
	 * 
	 * JUnit promotes the idea of "First testing then coding", this emphasizes on setting up the test data
	 * for a piece of code that can be tested first and then implemented.
	 * The approach is basically "Test a little, code a little, test a little, etc"
	 * 
	 * 
	 * JUnit is a regression testing framework
	 * 
	 * 
	 * 
	 * 
	 * What is a Unit Test Case?
	 * 
	 * A Unit Test case is a part of code, which ensures that another part of code works as expected
	 * To achieve teh desierd results quickly, a test framework is required
	 * JUnit is what is predominantly used with Java
	 * 
	 * A formal written unit test case is characterized by a known input and an expected output, which is 
	 * worked out before the test is expected
	 * 
	 * 
	 * 
	 * Features of JUnit Test Framework
	 * - Fixtures
	 * - Test Suites
	 * - Test Runners
	 * - JUnit Classes
	 * 
	 * There are quite a few annotations in JUnit, here are some of the core ones
	 * 
	 * @Test - Denotes that a method is a test method
	 * 
	 * @BeforeEach - Denotes that the annotated method should be executed before each @Test
	 * 
	 * @AfterEach - Denotes that the annotated method should be executed after each @Test
	 * 
	 * @BeforeAll - Method should be executed before all @Test
	 * 
	 * @AfterAll - Method should be executed after all @Test s
	 * 
	 */
	
	private Calculator calculator = new Calculator();
	
	@BeforeAll
	void init() {
		calculator = new Calculator();
	}
	
	@Test
	@Disabled("Example of disabling a test")
	void additionTest() {	
		assertEquals(2, this.calculator.add(6, 1));
	}
	
	@Test
	void subtractionTest() {
		assertEquals(5, this.calculator.subtract(10, 5));
	}
	
	
	@Test
	void standardAssertions() {
		assertEquals(5, 2 + 3);
		assertEquals(4, this.calculator.multiply(2,2),
				"The optional failure message is now the last parameter");
		
		assertTrue(5 < 10, () -> "Assertion messages can be lazily evaluated to avoid constructing complex"
				+ "messages unnecessarily");
		
	}
	
	@Test
	void exceptionTesting() {
		Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
		assertEquals("/ by zero", exception.getMessage());
	}
	
	
	@BeforeAll
	void initAll() {
		
	}
	
	@BeforeEach
	void initEach() {
		
	}
	
	@AfterEach
	void tearDown() {
		
	}
	
	@AfterAll
	void tearDownAll() {
		
	}
	
	

}

package com.revature;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MockingExampleTest {
	/*
	 * Unit tests are inexpensive and fast to perform
	 * Tehy rely heavily on these.
	 * Only once you've exhausted these tests should you move up to the next level of testing
	 * i.e. integration tests
	 * 
	 * So why is mocking needed?
	 * 
	 * When classes are dependent on each other, (as in having a Has A relationship) then it can be
	 * tricky to isolate the code and to effectively unit test it when the functionality is reliant
	 * on another class
	 * 
	 * Mocks: Are objects that are pre-programmed with expectations which form a specification
	 * of the calls they are expected to receive
	 * 
	 * Stubs: Provide canned answers to calls made during the test. Usually not responding to anything
	 * outside what is programmed in the test. Stubs may also record information about calls to any of
	 * its methods.
	 * 
	 * 
	 * Mocks vs Stubs = Behavior testing vs State testing
	 * 
	 * Both mocks and stubs answer the question : What is the result?
	 * 
	 * Mocks are also interested in : How has the result been achieved?
	 * 
	 */
	
	@Mock
	List<String> mockedList;
	
	
	@BeforeAll
	void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void usingMockAnnotationTest() {
		mockedList.add("One");
		
		Mockito.verify(mockedList).add("One");
	
		assertEquals(0, mockedList.size());
		
		Mockito.when(mockedList.size()).thenReturn(1200);
		
		assertEquals(1200, mockedList.size());
	}

}










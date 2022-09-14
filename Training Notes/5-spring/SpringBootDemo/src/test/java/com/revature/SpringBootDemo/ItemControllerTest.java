package com.revature.SpringBootDemo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@Test
	public void getItem() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/item/5").accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect((ResultMatcher) content().string(equalTo("{\"name\":\"5\"}")));
	}
}

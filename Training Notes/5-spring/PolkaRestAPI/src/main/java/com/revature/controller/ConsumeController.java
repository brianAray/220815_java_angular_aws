package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/consume")
public class ConsumeController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public @ResponseBody Object getPolkamon(@PathVariable int id) {
		
		Object polkamon = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/" + id, Object.class);
		
		return polkamon;
		
	}
	
	
	
}

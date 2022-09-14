package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Polkamon;

@RestController
@RequestMapping("polka")
public class PolkaConsumer {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public Polkamon getPolkamon(@PathVariable int id) {
		HttpEntity<Polkamon> polkamon = restTemplate.getForEntity("http://localhost:8080/polka/54", Polkamon.class);
		
		return polkamon.getBody();
	}
}

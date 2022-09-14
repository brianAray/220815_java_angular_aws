package com.revature.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Ability;
import com.revature.model.Polkamon;

@RestController
@RequestMapping("/polka")
public class PolkaController {

	@CrossOrigin(origins = "http://localhost:6060")
	@GetMapping("/{id}")
	public Polkamon getPolkamon(@PathVariable int id) {
		return new Polkamon(id, "Garry", Arrays.asList(new Ability(1, "Punch", "Polkamon punches hard!")));
	}
}

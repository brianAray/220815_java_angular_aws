package com.revature.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.SpringBootDemo.model.Item;

@RestController
@RequestMapping("/RestItem")
public class RestItemController {

	@GetMapping(value="/{id}", produces="application/json")
	public Item getItem(@PathVariable(required=true) int id) {
		return new Item(Integer.toString(id));
	}
}

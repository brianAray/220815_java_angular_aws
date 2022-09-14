package com.revature.SpringBootDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.SpringBootDemo.model.Item;

@Controller
@RequestMapping("/item")
public class ItemController {

	@GetMapping(value="/{id}", produces="application/json")
	public @ResponseBody Item getItem(@PathVariable int id) {
		return new Item(Integer.toString(id));
	}
	
	@PostMapping("/create")
	void makeItem(@ModelAttribute("item") Item item) {
		
	}
}

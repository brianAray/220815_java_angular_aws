package com.revature.SpringBootDemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;


@Controller
@RequestMapping(value="/place")
public class HelloController {

	// This GetMapping annotation species a GET request to the /greeting endpoint
	@GetMapping("/greeting")
	
	// The @RequestParam binds the value of the query string param name into the name parameter of the 
	// greeting() method
	public String greeting(
			@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		model.addAttribute("name", name);
		if(name.equals("Brian")) {
			throw new IllegalArgumentException("Invalid Name");
		}
		return "greeting";
	}
	
	@RequestMapping(value="/users/home", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	

	
	
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	void onIllegalArgumentException(IllegalArgumentException exception) {
		
	}
	
}

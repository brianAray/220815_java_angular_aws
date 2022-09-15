package com.revature.SpringBootDemo.controller;

import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/another")
public class AnotherController {

	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
	
	@GetMapping("/hello2")
	public ResponseEntity<String> hello2(){
		return ResponseEntity.ok()
				.header("custom-header", "nice")
				.body("hello there");
	}
	
	@GetMapping("/age")
	public ResponseEntity<String> age(
			@RequestParam("yearOfBirth") int yearOfBirth){
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("custom-header", "Hello There");
		
		if(yearOfBirth > LocalDate.now().getYear()) {
			return new ResponseEntity<>(
					"Year of Birth cannot be in the future",
					headers,
					HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(
				"Your age is: " + (LocalDate.now().getYear() - yearOfBirth),
				headers,
				HttpStatus.OK);
	}
	
	
	
	@GetMapping("/checkheader")
	public ResponseEntity<String> checkHeader(
			@RequestHeader(HttpHeaders.CONTENT_TYPE) String contentType,
			@RequestHeader(value="custom-header", required=false) String customHeader){
		if(contentType.equals(MediaType.APPLICATION_JSON.toString())) {
			return new ResponseEntity<>("Okay", HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Invalid Content Type", HttpStatus.BAD_REQUEST);
		}
	}
	
	
}

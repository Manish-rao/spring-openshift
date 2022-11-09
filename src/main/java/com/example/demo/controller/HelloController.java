package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test")
	public String hello() {
		return "Hello from the other side";
	}
	
	@GetMapping("/newTest")
	public String newTest() {
		return "Wow surprisingly this works!!!!";
	}
}

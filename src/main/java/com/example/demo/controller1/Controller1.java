package com.example.demo.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ping")
public class Controller1 {
	
	@GetMapping
	public String pong() {
		
		return "pong";
	}
}

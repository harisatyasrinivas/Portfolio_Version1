package com.satya.career.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

	@GetMapping(value="/tested/")
	public String testweb() {
		System.out.println("Website test method in controller executed from tested controller");
		return "index";		
	}
}

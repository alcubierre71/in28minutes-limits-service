package com.in28minutes.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limits_service.config.Configuration;
import com.in28minutes.microservices.limits_service.entity.Limits;

@RestController
public class LimitsController {

	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
	
		Limits limits = new Limits(config.getMinimum(), config.getMaximum());
		
		return limits;
		
	}
	
}

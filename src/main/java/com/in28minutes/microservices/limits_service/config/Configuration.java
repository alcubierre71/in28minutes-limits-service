package com.in28minutes.microservices.limits_service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

	private int minimum;
	private int maximum;
	
}

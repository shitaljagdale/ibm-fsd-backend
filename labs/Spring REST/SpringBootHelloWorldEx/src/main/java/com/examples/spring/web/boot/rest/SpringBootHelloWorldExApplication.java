package com.examples.spring.web.boot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringBootHelloWorldExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldExApplication.class, args);
	}
	@RequestMapping(value="/")
	public String sayHello() {
		return "Hello Spring Boot jhguyhvhy ";
	}

}

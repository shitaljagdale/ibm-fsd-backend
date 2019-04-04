package com.examples.spring.web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldcontroller {

	@RequestMapping(value="/",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public String sayHello() {
		System.out.println("Inside Hello World Controller..");
		//return "<html><body>Hello world From Spring REST</body></html>"; 
		return "{\"message\": \"Hello world in json\"}";
	}
	
	@RequestMapping("/greeting")
	@ResponseBody
	public String greeting1() {
		System.out.println("hello world from without param");
		return "hello world from without param"; 
	}
	
	@GetMapping(value="/greeting",params= {"msg"})
	@ResponseBody
	public String greeting2(String msg) {
		return "hello world from with param-"+msg; 
	}
	
	@PostMapping(value="/greeting",consumes= {"text/html"})
	@ResponseBody
	public String postGreeting(@RequestBody String reqBody) {
		return "recieved value  "+reqBody; 
	}
	
	@RequestMapping(value="/greeting",method=RequestMethod.PUT)
	@ResponseBody
	public String putGreeting() {
		return "Hello world From put "; 
	}
}

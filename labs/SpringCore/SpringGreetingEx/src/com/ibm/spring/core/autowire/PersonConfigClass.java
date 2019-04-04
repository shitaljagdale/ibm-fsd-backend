package com.ibm.spring.core.autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfigClass {
	
	@Bean
	public Customer customer() {
		return new Customer();
		
	}
	@Bean
	public Person person() {
		return new Person("Preeta",23,"Latur");
	}
	

}

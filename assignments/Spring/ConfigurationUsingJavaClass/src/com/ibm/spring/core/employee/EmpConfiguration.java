package com.ibm.spring.core.employee;

import java.time.LocalDate;
import java.util.ArrayList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfiguration {
	@Bean
	public Address address() {
		return new Address("Latur","India",413527);
		
	}
	@Bean
	public Employee employee() {
		ArrayList<String> skills=new ArrayList<>();
		skills.add("Skill1");
		skills.add("Skill2");
		LocalDate dpb=LocalDate.of(1996, 11, 6);
		return new Employee(1,"Shital",23,"Devloper",34000.0,skills,true,dpb);
		
	}
	

}

package com.ibm.spring.core.employee;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("emp-config.xml");
		Employee e=ctx.getBean("employee",Employee.class);
		
		e.printDetails();
		//e.testMe();
	}

}

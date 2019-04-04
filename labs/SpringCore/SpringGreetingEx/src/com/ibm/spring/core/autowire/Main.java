package com.ibm.spring.core.autowire;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext("PersonConfigClass.class");
		Customer c=ctx.getBean("customer",Customer.class);
		System.out.println(c.getPerson());
		
	}

}

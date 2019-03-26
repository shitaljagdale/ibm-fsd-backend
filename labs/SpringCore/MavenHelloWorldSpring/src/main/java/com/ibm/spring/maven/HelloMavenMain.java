package com.ibm.spring.maven;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMavenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Greetings g=ctx.getBean("greeting",Greetings.class);
		System.out.println(g.getMessage());

	}

}

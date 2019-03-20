package com.ibm.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorld {

	public static void main(String[] args) {
		// user create instance
		//Greetings greetings=new Greetings();
		//System.out.println(greetings.getMessage());
		
		//1:Create IOC container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		//2.access greetings from bean
	    Greetings g=	ctx.getBean("greetings",Greetings.class);
	    Greetings g1=	ctx.getBean("greetings1",Greetings.class);
	    
	    //3. print message
	    System.out.println(ctx.getBeanDefinitionCount());
	   System.out.println(g.getMessage());
	   System.out.println(g1.getMessage());
		
		
	}

}

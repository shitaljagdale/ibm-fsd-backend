package com.ibm.spring.core.employee.JavaClassConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(EmpConfiguration.class);
		Employee e=ctx.getBean("employee",Employee.class);
		e.printDetails();
		ctx.close();
		
	}

}

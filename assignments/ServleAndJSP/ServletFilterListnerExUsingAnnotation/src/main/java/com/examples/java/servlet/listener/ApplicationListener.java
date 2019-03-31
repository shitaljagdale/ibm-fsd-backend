package com.examples.java.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class ApplicationListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application  listner started...");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application listner destroyed...");
	}
}

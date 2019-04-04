package com.ibm.servlet.listner;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationListner implements ServletContextListener {
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application start...");
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application stop...");
	}

}

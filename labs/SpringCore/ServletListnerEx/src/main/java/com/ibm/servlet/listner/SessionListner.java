package com.ibm.servlet.listner;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListner implements HttpSessionListener {
	private static int currentUsers=0;
	private static int totalUsers=0;
	
	public void sessionCreated(HttpSessionEvent se) {
		currentUsers++;
		ServletContext context=se.getSession().getServletContext();
		currentUsers=Integer.parseInt((String) context.getAttribute("currentUsers"));
		context.setAttribute("currentUsers", currentUsers++);
		
	}
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}

}

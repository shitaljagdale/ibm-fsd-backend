package com.examples.java.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestListener;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListener implements HttpSessionListener {
  ServletContext context=null;
	private static int currentUsers = 0;
	private static int totalUsers = 0;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		totalUsers++;
		currentUsers++;
		 context = se.getSession().getServletContext();
		//currentUsers = Integer.parseInt((String)context.getAttribute("currentUsers"));
		context.setAttribute("currentUsers", currentUsers);
		context.setAttribute("totalUsers", totalUsers);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		currentUsers--;
		context.setAttribute("currentUsers",currentUsers );
	}
}

package com.ibm.servlet.filter;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggingFilter implements Filter{

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String host=request.getRemoteHost();
		//log request details
		System.out.println("Request recieved from "+host+"at "+LocalDateTime.now());
		//gelegate the controler further
		chain.doFilter(request, response);
	}

}

package com.examples.java.servlet.filter;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
@WebFilter(urlPatterns = {"/*"})
public class LoggingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String host = (String) request.getRemoteHost();
		// Log request details
		System.out.println("Request received from " + host + " at " + LocalDateTime.now());
		
		// delegate the control further
		chain.doFilter(request, response);
	}

}

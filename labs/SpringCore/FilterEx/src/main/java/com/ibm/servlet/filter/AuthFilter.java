package com.ibm.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuthFilter implements Filter {
	
	public void init(FilterConfig filterConfig) {
		System.out.println("Auth Filter initilizes ...");
		Enumeration<String> filterparamnames=filterConfig.getInitParameterNames();
		while(filterparamnames.hasMoreElements()) {
			String filterParamName=filterparamnames.nextElement();
			System.out.println("Filter parameteres..");
			System.out.println(filterParamName +": "+filterConfig.getInitParameter(filterParamName));
		}
		
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String username=request.getParameter("username");
		if(username!=null) {
			System.out.println("request from "+username);
			chain.doFilter(request, response);
		}
		else {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			 out.println("<!DOCTYPE>");
			    out.println("<html>");
			    out.println("<body>");
			    out.println("<h1>Invalid user. Please supply username in config </h1>");
			    out.println("</body>");
			    out.println("</html>");
		}
		
		
	}

}

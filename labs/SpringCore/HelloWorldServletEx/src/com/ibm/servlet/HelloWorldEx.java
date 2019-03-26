package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldEx extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Hello world servlet initilized");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Calling get method");
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		System.out.println("servlet invoked");
		PrintWriter out=resp.getWriter();
	    System.out.println("Context path "+resp.getContentType());
	    Enumeration<?> headerNames=req.getHeaderNames();
	    while(headerNames.hasMoreElements()) {
	    	String hname=(String) headerNames.nextElement();
	         System.out.println( hname+":"+req.getHeader(hname));

	    }
	    out.println("<!DOCTYPE>");
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Hello servlet</h1>");
	    out.println("<h1>"+LocalDateTime.now()+"</h1>");
	    out.println("</body>");
	    out.println("</html>");
	}
	public void destroy() {
		System.out.println("Hello world df servlet destroyed");
		
	}

}

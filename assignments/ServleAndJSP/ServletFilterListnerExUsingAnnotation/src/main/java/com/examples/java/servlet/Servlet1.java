package com.examples.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name="Servlet1",value = "/*") 
public class Servlet1 extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init()
	{
		System.out.println("Greeting Servlet Initialized...");
	}
	
	public void doGet(HttpServletRequest request,  HttpServletResponse response) throws IOException
	{
		this.doPost(request, response);
	}	
	
	public void doPost(HttpServletRequest request,  HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");

		// Output stream to write data into HTTP response
		PrintWriter out = response.getWriter();
		String n=request.getParameter("username");
		
		HttpSession session=request.getSession();
		session.setAttribute("username",n);
		
		//retriving data from servletcontext objrct
		ServletContext context=getServletContext();
		int t=(Integer) context.getAttribute("totalUsers");
		int c=(Integer) context.getAttribute("currentUsers");
		out.print("<br>Total Users "+t);
		out.print("<br>Current Users "+c);
		
		out.print("<br><a href='logout'>Logout</a>");
	}	
	
	public void destroy()
	{
		System.out.println("Greetign Servlet Destroyed...");
	}

}

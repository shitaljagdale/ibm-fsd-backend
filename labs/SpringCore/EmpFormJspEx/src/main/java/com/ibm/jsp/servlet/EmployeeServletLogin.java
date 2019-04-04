package com.ibm.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeServletLogin extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("Employee servlet initilized");
		ServletConfig config=getServletConfig();
		System.out.println("Servlet config parameters :");
	   
		Enumeration<String> paramName=	config.getInitParameterNames();
	   while(paramName.hasMoreElements()) {
		    String paramname=paramName.nextElement();
		     System.out.println("paramname : "+config.getInitParameter(paramname));
	      }
	    ServletContext context=config.getServletContext();
	    System.out.println("Servlet context parameters :");
	
	    Enumeration<String> contextParamName=	context.getInitParameterNames();
	     while(contextParamName.hasMoreElements()) {
		       String contextparamname=contextParamName.nextElement();
		       System.out.println("contextparamname : "+context.getInitParameter(contextparamname));
	      }
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

		String username=req.getParameter("username");
		
		String password=req.getParameter("password");
		
		
		HttpSession session=req.getSession();
		
		String uname1=(String) session.getAttribute("username");
		
		String pass1=(String) session.getAttribute("password");
		String gender=(String) session.getAttribute("gender");		
		System.out.println(gender);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		

	    out.println("<!DOCTYPE>");
	    out.println("<html>");
	    out.println("<body>");
	    
	   if(username.equals(uname1)&&password.equals(pass1)) {
		   resp.sendRedirect("login.jsp");
		   
	   }
	   else {
		   out.print("<p>Login Failed.</p>");	

			resp.sendError(500, "Login Failed");
	   }
	   
	}
	public void destroy() {
		System.out.println("employee servlet servlet destroyed");
		
	}

}

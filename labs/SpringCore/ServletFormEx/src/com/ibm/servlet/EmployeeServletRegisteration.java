package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeServletRegisteration extends HttpServlet {
	public void init() {
		System.out.println("Employee servlet initilized");
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
		
		
		HttpSession session=req.getSession();
		System.out.println("session ID:"+session.getId());
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		session.setAttribute("username", username);
		session.setAttribute("password", password);
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();

	    out.println("<!DOCTYPE>");
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<h1>Registration Successfully!!</h1>");
	    out.println("<p>username :"+username+"</p>");
	    out.println("<a href='index.html'>home</a>");
	    out.println("</body>");
	    out.println("</html>");
	}
	public void destroy() {
		System.out.println("employee servlet servlet destroyed");
		
	}

}

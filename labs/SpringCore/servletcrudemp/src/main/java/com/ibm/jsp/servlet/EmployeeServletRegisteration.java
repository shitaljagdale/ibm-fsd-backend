package com.ibm.jsp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**  
@author shital Bhaskar Jadhav

*/ 

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

		Emp emp = new Emp();
		HttpSession session = req.getSession();

		System.out.println("session ID:" + session.getId());
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String department = req.getParameter("department");
		String salary = req.getParameter("salary");
		String skills = req.getParameter("skills");

		session.setAttribute("username", username);
		session.setAttribute("password", password);
		session.setAttribute("department", department);
		session.setAttribute("salary", salary);
		session.setAttribute("skills", skills);

		resp.setContentType("text/html");
		resp.sendRedirect("register.jsp");
	}

	public void destroy() {
		System.out.println("employee servlet servlet destroyed");

	}

}

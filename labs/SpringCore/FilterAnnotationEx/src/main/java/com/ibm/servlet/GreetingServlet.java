package com.ibm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {
	
	public void init() {
	System.out.println("Hello world servlet initilized");
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	this.doPost(req, resp);
}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	//this.doPost(req, resp);
	PrintWriter out=resp.getWriter();
 
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

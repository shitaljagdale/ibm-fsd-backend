<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

<%
    out.println("<h1>Login Successfully!!</h1>");
     out.println("Welcome  : "+ session.getAttribute("username"));
     response.sendRedirect("addEmp.html");
    
	    %>
</body>
</html>
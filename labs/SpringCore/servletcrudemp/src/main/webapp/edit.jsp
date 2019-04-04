<%@page import="com.ibm.jsp.servlet.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <title>JSP Form Demo</title>
        <body>
        <h1>Edit Record here..</h1>
        <form action='EditServlet2' method='post'>
		<table>
	    <%
	  Emp obj=  (Emp)session.getAttribute("emp");
	    %>
	   
	    <tr><td>ID:</td><td><input type="number" name='id' value=<%=obj.getId() %>></td></tr>
		<tr><td>Name:</td><td><input type='text' name='name' value=<%=obj.getName() %>></td></tr>
		<tr><td>Password:</td><td><input type='password' name='password' value=<%=obj.getPassword() %>></td></tr>
		<tr><td>Email:</td><td><input type='email' name='email' value=<%=obj.getEmail() %>></td></tr>
	    <tr><td>Country:</td><td>
		<select name='country' style='width:150px'>
		<option>India</option>
		<option>USA</option>
		<option>UK</option>
		<option>Other</option>
		</select>
		</td></tr>
		<tr><td>Designation:</td><td><input type='text' name='designation' value=<%=obj.getDesignation() %>></td></tr>
		<tr><td>Department:</td><td><input type='text' name='department' value=<%=obj.getDepartment() %>></td></tr>
		<tr><td>Salary:</td><td><input type='number' name='salary' value=<%=obj.getSalary()%>></td></tr>
		<tr><td colspan='2'><input type='submit' value='Edit &amp; Save '/></td></tr>
		</table>
		</form> 	
        
        
        			
</body>
</html>
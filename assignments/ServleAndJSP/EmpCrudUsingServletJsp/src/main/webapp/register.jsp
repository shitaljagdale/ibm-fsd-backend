<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Registration successfully!!</h1>
<body>

<% out.println("username :"+session.getAttribute("username")); %>



<p><a href="index.jsp">home</a></p>

</body>
</html>
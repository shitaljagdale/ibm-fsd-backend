<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String name="shital"; %>
<jsp:useBean id="emp" class="com.ibm.jsp.servlet.Employee"></jsp:useBean>
<jsp:setProperty name="emp" property="name"  value="<%=name %>"/>

<jsp:getProperty property="name" name="emp"/>
</body>
</html>
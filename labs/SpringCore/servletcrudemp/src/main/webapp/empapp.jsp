<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>****** Welcome to employee managment Application *******</h2>
<TABLE BORDER="1" CELLPADDING="3" CELLSPACING="1">
<%
Object uname=session.getAttribute("username");
Object salary=session.getAttribute("salary");
Object department=session.getAttribute("department");
Object skills=session.getAttribute("skills");

%>

<tr>
<th>name</th>
<th>salary</th>
<th>department</th>
<th>skills</th>
<th>Edit</th>
<th>Delete</th>

</tr>
<tr>
<td> <%=uname%></td>
<td> <%=salary%></td>
<td> <%=department%></td>
<td> <%=skills%></td>
<td><a href="edit.jsp">Edit </a></td>
<td><a href="">Delete </a></td>



</tr>
    
</TABLE>

</body>
</html>
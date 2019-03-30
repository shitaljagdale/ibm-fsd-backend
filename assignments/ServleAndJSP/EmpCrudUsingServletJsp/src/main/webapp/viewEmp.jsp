<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Employees List</title>
</head>


<body>
	<span>Welcome <strong> <c:out value="${username}" /> </strong></span>
	<br>
	<h2>Employees List</h2>

	<table border="2" width="70%" cellpadding="2">
		<tr>
			<th>Name</th>
			<th>Password</th>
			<th>Email</th>
			<th>Department</th>
			<th>Designation</th>
			<th>salary</th>
			<th>Country</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
<!-- out.println("<a href='addEmp.html'>Add New Employee</a>");
		out.println("<h1>Employees List</h1>");
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Department</th><th>Designation</th><th>Salary</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
		for(Emp e:list){
			out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getDepartment()+"</td><td>"+e.getDesignation()+"</td><td>"+e.getSalary()+"</td><td>"+e.getCountry()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td><td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");
		}
		out.print("</table>"); -->
		<c:if test="${empty empList}">
			<tr>
				<td colspan="11" align="center">No record found to display.</td>
			</tr>
		</c:if>

		<c:forEach var="emp" items="${list}">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.password}</td>
				<td>${emp.email}</td>
				<td>${emp.department}</td>
				<td>${emp.designation}</td>
				<td>${emp.salary}</td>
				<td>${emp.country}</td>
				<td><a href="${contextPath}/employee/update/${emp.id}">Edit</a></td>
				<td><a href="${contextPath}/employee/delete/${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />


	<a href="${contextPath}/employee">Add New Employee</a> &nbsp;&nbsp;
	<a href="${contextPath}/logout">Logout</a>
</body>
</html>
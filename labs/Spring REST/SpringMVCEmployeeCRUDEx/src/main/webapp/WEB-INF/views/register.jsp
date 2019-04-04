<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>Registration</title>
</head>
<body>
<!-- <form action="/SpringMVCRegistrationEx/register/" method="POST">
	<p>Enter Username: <input name="username" type="text" /> </p>
	<p>Enter Password: <input name="password" type="password" /> </p>
	<p><button type="submit" value="Submit">Submit</button> <button type="reset" value="Reset">Reset</button> </p>
</form> -->
<h1>Registration page !</h1>
<form:form target="register" method="POST">

	    <p>Enter Username: <form:input path="username" /> </p>
	    <p>Enter password: <form:password path="password" /> </p>
		<p>Department:<input type="text" name="department"></p>
		<p>Designation:<input type="text" name="designation"></p>
		<p>Salary:<input type="number" name="salary"></p>
		Male<input type="radio" name="gender" value="male" />
		Female<input type="radio" name="gender" value="female" />
		
		<p>
		Country: <select name="userCountry">
			<option>India</option>
			<option>Pakistan</option>
			<option>other</option>
		</select> 
		</p>
		<br/>
		Skills:
		<br/>
		<input type="checkbox" name="skill1" value="JAVA"> JAVA<br>
		<input type="checkbox" name="skill2" value="JSP">JSP <br>
		<input type="checkbox" name="skill3" value="SERVLET"> SERVLET<br>
		<br>
		DOB<input type="datetime" name="date">
		

		
	<p><button type="submit" value="Submit">Submit</button> <button type="reset" value="Reset">Reset</button> </p>
</form:form>
</body>
</html>

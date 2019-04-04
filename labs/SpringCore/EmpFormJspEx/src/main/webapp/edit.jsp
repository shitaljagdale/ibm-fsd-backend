<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
        <title>JSP Form Demo</title>
        <style type="text/css">
            label{ margin-right:20px;}
            input{ margin-top:5px;}
        </style>
    </head>
    <body>
       <form action="guru_register" method="post">
       <fieldset>
                <legend>Edit Employee Info</legend>
			<table style="with: 50%">
				
				<tr>
					<td>UserName</td>
<%-- 					<td><input type="text" name="username" value=<%session.getAttribute(username) %>/></td> --%>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Deparment</td>
					<td><input type="text" name="department" /></td>
				</tr>
				<tr>
					<td>Designation</td>
					<td><input type="text" name="designation" /></td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><input type="number" name="salary" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td><input type="text" name="dob" /></td>
				</tr></table>
			</fieldset>
			<input type="submit" value="update" /></form>
</body>
</html>
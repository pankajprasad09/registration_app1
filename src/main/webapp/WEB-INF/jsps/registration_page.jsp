<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<style>
	table{
	margin-left:auto;
	margin-right:auto;
	}
	button{
	margin-left:650px;
	}
	p{
	margin-left:600px;
	}
</style>
</head>
<body>
	<h2 align="center">New Student Register Here</h2><hr>
	<form action="register">
	<table>
		<tr>
			<td>Name</td><td><input type="text" name="name"/></td>
		</tr>
		<tr>
			<td>Email</td><td><input type="email" name="email"/></td>
		</tr>
		<tr>
			<td>City</td><td><input type="text" name="city"/></td>
		</tr>
		<tr>
			<td>DOB</td><td><input type="date" name="dob"/></td>
		</tr>
		<tr>
			<td>Mobile</td><td><input type="number" name="mobile"/></td>
		</tr>
	</table><br>
	<button type="submit" value="Register">Register</button>
	</form>
	
	<p>${msg}</p>
</body>
</html>
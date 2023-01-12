<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update info</title>
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
	<h2 align="center">Edit Student Info</h2><hr>
	<form action="update">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="${student.id}"/></td>
		</tr>
		<tr>
			<td>Name</td><td><input type="text" name="name" value="${student.name}"/></td>
		</tr>
		<tr>
			<td>Email</td><td><input type="email" name="email" value="${student.email}"/></td>
		</tr>
		<tr>
			<td>City</td><td><input type="text" name="city" value="${student.city}"/></td>
		</tr>
		<tr>
			<td>DOB</td><td><input type="date" name="dob" value="${student.dob}"/></td>
		</tr>
		<tr>
			<td>Mobile</td><td><input type="number" name="mobile" value="${student.mobile}"/></td>
		</tr>
	</table><br>
	<button type="submit" value="Update">Update</button>
	</form>
</body>
</html>
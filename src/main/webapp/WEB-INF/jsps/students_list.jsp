<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students list</title>
<style>
	table{
	margin-left:auto;
	margin-right:auto;
	}
</style>
</head>
<body>
	<h2 align="center">List of all Registered students</h2><hr>
	<table>
		<tr>
			<th>Name</th>
			<th>City</th>
			<th>DOB</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach var="list" items="${studentList}">
			<tr>
				<td>${list.name}</td>
				<td>${list.city}</td>
				<td>${list.dob}</td>
				<td>${list.email}</td>
				<td>${list.mobile}</td>
				<td><a href="deleteOneStudent?id=${list.id}">Delete</a></td>
				<td><a href="updatePage?id=${list.id}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
		<td><a href="student/add">Add a new Student</a></td>
	</tr>
</table>
<table border="1">
<tr>
<th>Id</th><th>FirstName</th><th>LastName</th><th>Course</th><th>Country</th><th>Action</th>
</tr>
<c:forEach items="${student}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.firstName}</td>
<td>${e.lasstName}</td>
<td>${e.course}</td>
<td>${e.country }</td>
<td><a href="updateStudent?id=${e.id}">Update</a><a href="deleteStudent?id=${e.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
	
</body>
</html>
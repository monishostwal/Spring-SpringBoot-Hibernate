<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="process_form" modelAttribute="student">

	First Name: <form:input path="firstName"/><br>
	Last Name : <form:input path="lastName"/><br>
	<input type="submit" value="submit">
</form:form>
</body>
</html>
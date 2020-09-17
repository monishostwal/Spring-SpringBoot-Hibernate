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
<form:form action="result" modelAttribute="student">
<form:radiobuttons path="gender" items="${student.genders }"/>
<input type="submit" value="Submit">
</form:form>
</body>
</html>
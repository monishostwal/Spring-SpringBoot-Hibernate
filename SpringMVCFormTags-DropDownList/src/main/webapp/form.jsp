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
<form:select path="techOption">
<form:options items="${student.countryOptions }"/>

</form:select>
<input type="submit" value="Submit">

</form:form>

</body>
</html>
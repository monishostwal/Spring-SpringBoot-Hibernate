<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="result" modelAttribute="pincode">
<form:input path="pincode_no"/>
<form:errors path="pincode_no"></form:errors>
<input type="submit" value="Submit">
 </form:form>
</body>
</html>
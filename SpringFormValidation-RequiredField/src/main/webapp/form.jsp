<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.show_red{color: red}
</style>
</head>
<body>
<form:form action="result" modelAttribute="customer">
<form:input path="firstName" />
<form:input path="mail"/>
<form:errors path="mail" cssClass="show_red"></form:errors>
<input type="submit" value="Submit">
</form:form>

</body>
</html>
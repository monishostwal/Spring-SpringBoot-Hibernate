<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <c:forEach var = "i" begin = "0" end = "${student.getChoices().size()-1 }">
          <c:out value = "${student.getChoices().get(i) }"/><p>
      </c:forEach>

</body>
</html>
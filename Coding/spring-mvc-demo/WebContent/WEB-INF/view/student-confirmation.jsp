<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	Student name is: ${student.firstName} ${student.lastName} <br /><br /> 
	Student's Country: ${student.country} <br/><br/>
	Student's Favorite Language: ${student.favouriteLanguage} <br/><br/>
	Student's Favorite Operating System:
	<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
	</ul>
	
</body>
</html>
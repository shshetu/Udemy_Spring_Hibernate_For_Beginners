<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName" />
		<br />
		<br />
Last Name: <form:input path="lastName" />
		<br />
		<br />

		<%-- Country: <form:select path="country">
		<form:option value="Brazil" label="Brazil"></form:option>
		<form:option value="India" label="India"></form:option>
		<form:option value="Germany" label="Germany"></form:option>
		<form:option value="France" label="France"></form:option>
	</form:select>  --%>
	
	Country: <form:select path="country"><form:options items="${student.countries}" /></form:select> <br /><br />
	<%-- Favourite Language: 
	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
	C# <form:radiobutton path="favouriteLanguage" value="C"/>
	PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
	Python <form:radiobutton path="favouriteLanguage" value="Python"/> <br /><br /> --%>
	
	Favorite Languages: <form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"/> <br /><br />
	Favorite Operating Systems: 
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/> <br /><br />
	<input type="Submit" value="submit" />
	</form:form>
</body>
</html>
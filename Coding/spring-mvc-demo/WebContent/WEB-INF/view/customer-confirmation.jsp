<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation page</title>
</head>
<body>
Welcome ${customer.firstName} ${customer.lastName} <br/><br/>
Free Passes: ${customer.freePasses} <br/><br/>
Postal code: ${customer.postalCode} <br/><br/>
Course code: ${customer.courseCode} <br/><br/>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> Welcome : ${modelStd.getName()} </h2>
	<h3> Email : ${modelStd.getEmail()} </h3>
	<h3> Password : ${modelStd.getPassword()} </h3>
	<h3> Gender : ${modelStd.getGender()} </h3>
	<h3> City : ${modelStd.getCity()} </h3>
</body>
</html>
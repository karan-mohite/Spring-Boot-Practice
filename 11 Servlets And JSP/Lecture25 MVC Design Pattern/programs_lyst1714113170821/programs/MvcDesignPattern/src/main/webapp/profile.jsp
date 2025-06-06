
<%@page import="in.sp.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: lime;">

	<%
		User user = (User) session.getAttribute("session_user");
		String name = user.getName();
		String email = user.getEmail();
		String city = user.getCity();
	%>

	<h3> Welcome : <%= name %></h3>
	<h3> Email : <%= email %></h3>
	<h3> City : <%= city %></h3>
	
	<a href="logout"> Logout </a>
</body>
</html>
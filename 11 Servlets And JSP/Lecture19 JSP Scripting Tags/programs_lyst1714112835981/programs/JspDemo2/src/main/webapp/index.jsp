<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h3> Welcome to Smart Programming </h3>
	
	<%!
		int rollno=101;
		String name = "deepak";
		
		public int add(int a, int b)
		{
			return a+b;
		}
	%>
	
	<%= rollno %>
	<%= name %>
	<%= add(100, 200) %>
	
	<%
		//any java code, logic, method call, JDBC, request - response - session code etc
		
		System.out.println("hello deepak");
	
		int no1=10, no2=20;
		int sum = no1+no2;
		out.println("Sum is : "+sum);
		
		if(no1>5)
		{
			out.println("true");
		}
		
		for(int i=1; i<=5; i++)
		{
			out.println(i);
		}
	%>
	
	<%= LocalTime.now() %>
	<%= Math.random() %>
	
</body>
</html>
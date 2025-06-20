<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error_design
	{
		color:red;
	}
</style>
</head>
<body>
	<h2> Register Here </h2>
	
	<form:form action="regForm" method="POST" modelAttribute="modelStd">
		Name : <form:input path="name"/> <form:errors path="name" cssClass="error_design" /> <br/> <br/>
		Email : <form:input path="email"/> <form:errors path="email" cssClass="error_design" /> <br/> <br/>
		Password : <form:password path="password"/> <form:errors path="password" cssClass="error_design" /> <br/> <br/>
		Gender : <form:radiobutton path="gender" label="Male" value="Male"/> <form:radiobutton path="gender" label="Female" value="Female"/> <form:errors path="gender" cssClass="error_design" />  <br/> <br/>
		City : <form:select path="city">
					<form:option value="" label="Select City" />
					<form:option value="Chandigarh" label="Chandigarh" />
					<form:option value="Mumbai" label="Mumbai" />
					<form:option value="Pune" label="Pune" />
				</form:select>
				<form:errors path="city" cssClass="error_design" /> <br/> <br/>
				
		<input type="submit" value="Register" />
	</form:form>
	
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean class="in.sp.beans.Student" id="stdId" />

<jsp:setProperty property="name" name="stdId" value="Deepesh" />
<jsp:setProperty property="rollno" name="stdId" value="102" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	Name : <jsp:getProperty property="name" name="stdId"/> <br/>
	Rollno : <jsp:getProperty property="rollno" name="stdId"/>
	
</body>
</html>
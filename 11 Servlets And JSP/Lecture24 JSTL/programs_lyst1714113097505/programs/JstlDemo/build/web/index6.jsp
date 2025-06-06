<%-- 
    Document   : index6
    Created on : 2 Nov, 2023, 8:59:37 AM
    Author     : Deepesh Panwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach begin="1" end="10" var="i">
            ${5*i} <br/>
        </c:forEach>
            
        <br/> <br/> <br/>
        
        <c:set var="names" value="${['Amit','Deepak','Deepesh','Rahul','Kamal']}" />
        
        ${names} <br/>
        <c:forEach begin="0" end="4" var="i">
            ${names[i]} <br/>
        </c:forEach>
            
        <br/><br/><br/>
        
        <c:forEach items="${names}" var="name1">
            ${name1} <br/>
        </c:forEach>
    </body>
</html>

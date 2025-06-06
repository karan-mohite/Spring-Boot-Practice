<%-- 
    Document   : index7
    Created on : 2 Nov, 2023, 9:07:39 AM
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
        <c:set var="names" value="Amit,Deepak,Deepesh,Kamal,Rahul" />
        
        ${names} <br/> <br/>
        
        <c:forTokens items="${names}" delims="," var="myname">
            ${myname} <br/>
        </c:forTokens>
    </body>
</html>

<%-- 
    Document   : index3
    Created on : 2 Nov, 2023, 8:46:53 AM
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
        <c:set var="rollNumbers" value="${['101','102','103','104','105']}" />
        <c:set var="names" value="${['Amit','Deepak','Deepesh','Rahul','Kamal']}" />
        
        <c:set var="rollNo" value="110" />
        
        <c:choose>
            <c:when test="${rollNo == rollNumbers[0]}">
                ${names[0]}
            </c:when>
            <c:when test="${rollNo == rollNumbers[1]}">
                ${names[1]}
            </c:when>
            <c:when test="${rollNo == rollNumbers[2]}">
                ${names[2]}
            </c:when>
            <c:when test="${rollNo == rollNumbers[3]}">
                ${names[3]}
            </c:when>
            <c:when test="${rollNo == rollNumbers[4]}">
                ${names[4]}
            </c:when>
            <c:otherwise>
                Invalid rollno
            </c:otherwise>
        </c:choose>
    </body>
</html>

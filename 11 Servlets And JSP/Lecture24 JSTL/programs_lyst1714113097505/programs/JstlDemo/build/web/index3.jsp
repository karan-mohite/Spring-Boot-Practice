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
        <c:choose>
            <c:when test="${103 == 101}">
                Amit
            </c:when>
            <c:when test="${103 == 102}">
                Deepak
            </c:when>
            <c:when test="${103 == 103}">
                Deepesh
            </c:when>
            <c:when test="${103 == 104}">
                Rahul
            </c:when>
            <c:when test="${103 == 105}">
                Kamal
            </c:when>
            <c:otherwise>
                Invalid rollno
            </c:otherwise>
        </c:choose>
    </body>
</html>

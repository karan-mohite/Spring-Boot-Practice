<%-- 
    Document   : index2
    Created on : 2 Nov, 2023, 8:43:26 AM
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
        <c:if test="${10 < 20}">
            hello 1
        </c:if>
            
        <c:if test="${10 lt 20}">
            hello 2
        </c:if>
    </body>
</html>

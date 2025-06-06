<%-- 
    Document   : index5
    Created on : 2 Nov, 2023, 8:55:09 AM
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
        <c:catch var="myException">
            <%
                int res = 100/0;
                out.println(res);
            %>
        </c:catch>
        
        <c:if test="${myException != null}">
            <p> <b> Exception :</b> ${myException} </p>
            <p> <b> Exception Message :</b> ${myException.message} </p>
        </c:if>
    </body>
</html>

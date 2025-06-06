<%-- 
    Document   : index
    Created on : 1 Nov, 2023, 8:52:57 AM
    Author     : Deepesh Panwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("myname1");
            out.println("Welcome : "+name);
        %>
    </body>
</html>

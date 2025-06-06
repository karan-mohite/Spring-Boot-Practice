<%-- 
    Document   : home
    Created on : 1 Nov, 2023, 9:28:34 AM
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
            String[] str = {"Deepak", "Amit", "Deepesh", "Rahul"};
            pageContext.setAttribute("name_str", str);
        %>
        ${name_str[0]} <br/>
        ${name_str[1]} <br/>
        ${name_str[2]} <br/>
        ${name_str[3]} <br/>
    </body>
</html>

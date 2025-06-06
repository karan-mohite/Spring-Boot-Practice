<%-- 
    Document   : index
    Created on : 1 Nov, 2023, 9:14:00 AM
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
        ${10+20} <br/> <br/>
        
        ${10 > 20} <br/> <br/>
        
        ${10 le 20} <br/> <br/>
        
        
        <%
            pageContext.setAttribute("no1", 100);
            pageContext.setAttribute("no2", 200);
        %>
        ${no1+no2}
    </body>
</html>

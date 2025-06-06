<%-- 
    Document   : first
    Created on : 1 Nov, 2023, 9:21:24 AM
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
        1 : ${param.myname1} <br/> <br/>
        
        
        <%
            request.setAttribute("req_name", "amit");
        %>
        2 : ${requestScope.req_name}
    </body>
</html>

<%-- 
        <%
            String name = request.getParameter("myname1");
            out.println(name);
        %>
--%>
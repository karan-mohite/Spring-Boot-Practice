<%-- 
    Document   : second
    Created on : 1 Nov, 2023, 9:34:13 AM
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
        <b>Welcome :</b> ${param.name1} <br/> <br/>
        <b>Selected Colors :</b> ${paramValues.color1[0]}, ${paramValues.color1[1]}, ${paramValues.color1[2]}
    </body>
</html>

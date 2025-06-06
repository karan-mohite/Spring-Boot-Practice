<%-- 
    Document   : colorsform
    Created on : 1 Nov, 2023, 9:31:15 AM
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
        <form action="second.jsp" method="get">
            Name : <input type="text" name="name1" /> <br/> <br/>
            Colors : 
            <select size="3" multiple="true" name="color1">
                <option value="Green"> Green </option>
                <option value="Yellow"> Yellow </option>
                <option value="Red"> Red </option>
            </select> <br/> <br/>
            <input type="submit" value="Click Me" />
        </form>
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="name1" value="Deepak Panwar" />
        
        1 : <c:out value="${name1}" /> <br/>
        2 : ${name1} <br/> <br/>
        
        
        <c:remove var="name1" />
        
        
        1 : <c:out value="${name1}" /> <br/>
        2 : ${name1}
    </body>
</html>

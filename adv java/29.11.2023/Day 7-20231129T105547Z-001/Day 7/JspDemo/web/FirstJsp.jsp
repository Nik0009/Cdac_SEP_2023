<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>First Jsp Page</h1>    
        <jsp:include page="SecondJsp.jsp">
            <jsp:param name="inst" value="CDac"/>
        </jsp:include>
    </body>
</html>

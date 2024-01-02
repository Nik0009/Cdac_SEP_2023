<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>division of numbers</h1>
        <%
            int n1=Integer.parseInt(request.getParameter("fn")) ;
            int n2=Integer.parseInt(request.getParameter("sn")) ;
        
        %>
        
        <%=         "dividion is :"+(n1/n2)  %>
    </body>
</html>


<%@page contentType="text/html" pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%--This is my first Jsp Comment--%>
        
        <%--Declarative Tag --%>
        <%!
            int x=10;
            int display(){
            return x;
        }
        %>
        
        
        <%--Scriplet  Tag --%>
        <%
            for(int i=0;i<8;i++){
            out.println("<h"+i+">"+display()+"</h"+i+">");
            }
           
            String name=request.getParameter("nm");
            application.setAttribute("inst","cdac");
        %>
        
        <%--Expression  Tag --%>
        <h3>
        <%= "hello "+name+":"+application.getAttribute("inst") %>
        </h3>
    </body>
</html>

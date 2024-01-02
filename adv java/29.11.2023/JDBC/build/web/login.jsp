
<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("un");
            String password = request.getParameter("pass");
            try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_testemp?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","Pass@123");
            PreparedStatement pst = con.prepareStatement("Select * from employee where empName=? and empPass=?");
            pst.setString(1,user);
            pst.setString(2,password);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
            out.println("<h3>Login Successfull</h3>");
            }else{
            out.println("<h3>Login Failed</h3>");
            }
            }catch(Exception e){
            out.println(e.getMessage());
            }
        %>
        
    </body>
</html>
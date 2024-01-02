package javaapplication1;

import java.sql.*;
public class JavaApplication1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_testemp?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","Pass@123");
            Statement pst=con.createStatement();
            String sql="Select * from Employee where empName='nik' and empPass='12345'";
            ResultSet rs=pst.executeQuery(sql);
            
            if(rs.next()){
                System.out.println("<h3>Login Successful</h3>");
            }
            else{
                System.out.println("<h3>Login Fail</h3>");
            }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
}

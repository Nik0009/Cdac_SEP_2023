
package concept2;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "Concepts2", urlPatterns = {"/Conc2"})
public class BasicConcepts2 extends HttpServlet {
    
    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        PrintWriter out=sr1.getWriter();
        sr1.setContentType("text/html");
        
        out.println("<body bgcolor='cyan'> <center>");
        for(int i=0;i<7;i++)
        {
            out.println("<h"+i+">"+"hello servlet..."+"</h"+i+">");
        }
        out.println("</center> </body>");
   
        
    }
    
 

}

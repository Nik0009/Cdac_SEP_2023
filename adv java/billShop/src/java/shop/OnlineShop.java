package shop;



import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "OnlineShop", urlPatterns = {"/OnlineShop"})
public class OnlineShop extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OnlineShop</title>");            
            out.println("</head>");
            out.println("<body>");
            
            ServletConfig cfg=getServletConfig();
            String proName=request.getParameter("pn");
            String proQuan=request.getParameter("pq");
            String but1=request.getParameter("atc");
            String but2=request.getParameter("bill");
            
            int t=0;
            
            if(but1 != null){
                Cookie ck=new Cookie(proName,proQuan);
               // ck.setMaxAge(60*60*24*7);
                response.addCookie(ck);
                response.sendRedirect("shopping.html");
            }
            if(but2 != null){
                out.println("<h1>You have Purchased</h1>");
                Cookie ck[]=request.getCookies();
                
                for(Cookie c:ck){
                    
                    out.println("product name:"+c.getName()+"<br/>quantity:"+c.getValue());
                    int q=Integer.parseInt(c.getValue());
                    int p=Integer.parseInt(cfg.getInitParameter(c.getName()));
                    
                    int r=p*q;
                    out.println("<br/>price :"+r+"<br/>");
                    out.println("***************<br/>");
                    t+=r;
                    
                }
                out.println("total amount="+t);
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

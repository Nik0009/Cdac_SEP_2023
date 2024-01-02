<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>OnlineShop</title>
</head>
<body>
    
    <%
        String proName = request.getParameter("pn");
        String proQuan = request.getParameter("pq");
        String but1 = request.getParameter("atc");
        String but2 = request.getParameter("bill");
    %>

    
    <%
        if (but1 != null) {
            Cookie ck = new Cookie(proName, proQuan);
           
            response.addCookie(ck);
            response.sendRedirect("shop.jsp");
        }

        if (but2 != null) {
            out.println("<h1>You have Purchased</h1>");
            Cookie ck[] = request.getCookies();
            for (Cookie c : ck) {
                out.println(c.getName() + " : " + c.getValue() + "<br/>");
            }
        }
    %>
</body>
</html>

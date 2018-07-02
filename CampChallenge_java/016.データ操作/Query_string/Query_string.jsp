<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        request.setCharacterEncoding("UTF-8");
            
            out.println("合計"+request.getParameter("total") +"円");
            out.println(request.getParameter("count")+"品");
            out.println(request.getParameter("type"));
            
            int a = Integer.parseInt(request.getParameter("total"));
            int b = Integer.parseInt(request.getParameter("count"));
            int c = a/b;
            
            out.println("一品あたり"+ c +"円");
            
            if (3000 > a) {
                    out.println("ポイント0p");
                } else if (a > 3000 || 5000 > a) {
                        out.println("ポイント"+a*0.04+"p");
                    } else if (a > 5000) {
                            out.println("ポイント"+a*0.05+"p");
                        }
        %>
    </body>
</html>

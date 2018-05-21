<%-- 
    Document   : for2
    Created on : 2018/05/21, 14:02:18
    Author     : hojo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String total = "";
            for (int i = 0; i < 30; i++) {
                total = total + "A";
            }
            out.print(total);
        %>
    </body>
</html>

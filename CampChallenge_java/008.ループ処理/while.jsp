<%-- 
    Document   : newjsp1
    Created on : 2018/05/21, 17:03:21
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
            int i = 1000;
            
            while( i >=100) {
                i = i /2;
               }
            out.print(i);
        %>
    </body>
</html>

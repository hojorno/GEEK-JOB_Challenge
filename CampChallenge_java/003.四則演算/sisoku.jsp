<%-- 
    Document   : sisoku
    Created on : 2018/05/16, 13:04:03
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
        final int KAMI = 114514;
        int num = 4;
        
        int tasu = KAMI + num;
        int hiku = KAMI - num;
        int kake = KAMI * num;
        int wari = KAMI / num;
        
        out.print(KAMI*hiku/kake-tasu+wari);
        %>

    </body>
</html>

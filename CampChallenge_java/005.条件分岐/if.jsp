<%-- 
    Document   : if
    Created on : 2018/05/18, 15:35:55
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
            int num = 2;
            if (num == 1){
                out.println("１です！");
            }else if (num == 2){
                out.print("プログラミングキャンプです！");
            }else {
                out.print("その他です！");
            }
        %>
    </body>
</html>

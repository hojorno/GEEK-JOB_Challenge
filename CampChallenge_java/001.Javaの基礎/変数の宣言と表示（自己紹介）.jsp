<%-- 
    Document   : 変数の表示と宣言（自己紹介）
    Created on : 2018/05/14, 18:33:03
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
            int age = 27;
            
        String name = "北條孝明です、歳は";
        String ziko = "歳です。";
        String syumi = "趣味はネットゲームと散歩です!";
        out.print(name+age+ziko+syumi);
        %>
    </body>
</html>

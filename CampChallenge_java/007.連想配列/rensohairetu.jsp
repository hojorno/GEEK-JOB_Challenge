<%-- 
    Document   : rensohairetu
    Created on : 2018/05/21, 10:54:24
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
        <%@ page import="java.util.HashMap" %>
<%
    HashMap<String, String> box =
            new HashMap<String, String>();
    box.put("1", "AAA");
    box.put("hello", "world");
    box.put("soeda", "33");
    box.put("20", "20");
    out.print(box.get("hello"));
%>

    </body>
</html>

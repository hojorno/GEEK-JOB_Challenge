<%-- 
    Document   : for1
    Created on : 2018/05/21, 13:10:23
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
 long answer = 1;

          for( int i=0; i<20; i++ ){ 
               answer = answer * 8; 
          } 
          out.print(answer);
       %>
    </body>
</html>

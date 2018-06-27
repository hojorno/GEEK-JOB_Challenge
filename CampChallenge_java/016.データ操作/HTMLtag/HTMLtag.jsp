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
out.print(request.getParameter("Name"));
out.print(request.getParameter("sex"));
out.print(request.getParameter("job"));
        %>
    </body>
</html>

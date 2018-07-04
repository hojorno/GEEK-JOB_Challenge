<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
    HttpSession hs = request.getSession();
    //セッションを受け取る
    String name1 = (String) hs.getAttribute("name");
    String sex1 = (String) hs.getAttribute("sex");
    String hobby1 = (String) hs.getAttribute("hobby");
    %>
    <body>
        <form action="../SessionField" method="post">
            
            <p>名前</p>
            <input type="text" name="name" value="<%if (name1 != null){out.print(name1);}%>">
            <p>男</p>
            <input type="radio" name="sex" value="男"<%if (sex1 != null && sex1.equals("男")){out.print("checked");}%>>
            <p>女</p>
            <input type="radio" name="sex" value="女"<%if (sex1 != null && sex1.equals("女")){out.print("checked");}%>>
            <p>趣味</p>
            <input type="text" name="hobby" value="<%if (hobby1 != null){out.print(hobby1);}%>">
            <input type="submit" name="btnsubmit">
        </form>
    </body>
</html>
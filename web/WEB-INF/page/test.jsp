<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/9
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>SrpingMvc传参方式</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/param" method="post">
            用户名：<input type="text" name="userName"><br>
            密码：<input type="text" name="password"><br>
            <input type="submit" value="提交">
        </form>
    </body>
</html>

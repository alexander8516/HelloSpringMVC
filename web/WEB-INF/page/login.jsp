<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/10
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>登录</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/user/login" method="post">
            姓名：<input type="text" name="uname"> <br>
            密码：<input type="password" name="upass"><br>
            <input type="submit" value="提交">
        </form>
        ${messageError }
    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/8
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>$Title$</title>
    </head>
    <body>
        ${message}
        没注册的用户，请 <a href="${pageContext.request.contextPath}/index/register">注册</a>
            <br>
        已注册的用户，请 <a href="${pageContext.request.contextPath}/index/login">登录</a>
    </body>
</html>

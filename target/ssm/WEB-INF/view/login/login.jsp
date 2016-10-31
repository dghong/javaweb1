<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/17 0017
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
  <form action="/login/login" method="post">
      姓名:<input type="text" id="username" name="username" /><br />
      密码:<input type="password" id="password" name="password" /><br />
      <input type="submit" value="提交" />
  </form>
</body>
</html>

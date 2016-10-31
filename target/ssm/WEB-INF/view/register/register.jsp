<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/17 0017
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>会员注册</title>
</head>
<body>
    <form action="register/success">
         用户名:<input type="text" minlength="6" /><br />
         密&nbsp;码:<input type="password" /><br />
         <input type="submit" value="Submit" />
    </form>
</body>
</html>

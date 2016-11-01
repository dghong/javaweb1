<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/17 0017
  Time: 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../css/login.css" />
</head>
<body>
<c:if test="${!empty message}">
    <font style="color: red;">${message}</font>
</c:if>
<form role="form" action="/register/success" method="post">
    <div class="input-group">
        <span class="input-group-addon">所属学院</span>
        <select class="form-control" name="usercollege">
            <option>请选择学院</option>
            <option>财经学院</option>
            <option>法学院</option>
            <option>管理学院</option>
            <option>教育学院</option>
            <option>马克思主义学院</option>
            <option>民族研究院</option>
            <option>体育学院</option>
            <option>外语学院</option>
            <option>文学院</option>
            <option>新闻传播学院</option>
            <option>信息工程学院</option>
            <option>医学院</option>
        </select>
    </div>
    <div class="input-group">
        <span class="input-group-addon">用户名</span>
        <input type="text" class="form-control" name="username" id="username" placeholder="您的账户名或登录名">
    </div>
    <div class="input-group">
        <span class="input-group-addon">设置密码</span>
        <input type="password" class="form-control" id="Password" name="userpassword" placeholder="建议至少使用两种字符组合">
    </div>
    <div class="input-group">
        <span class="input-group-addon">确认密码</span>
        <input type="password" class="form-control" id="Password1" placeholder="请再次输入密码">
    </div>
    <div class="input-group">
        <span class="input-group-addon">中国+86</span>
        <input type="text" class="form-control" id="Telephone" placeholder="建议使用常用手机" name="userphone">
    </div>
    <%--<div class="input-group">--%>
        <%--<span class="input-group-addon">验证码</span>--%>
        <%--<input type="text" class="form-control" placeholder="请输入验证码">--%>
    <%--</div>--%>
    <%--<div class="input-group">--%>
        <%--<span class="input-group-addon">手机验证码</span>--%>
        <%--<input type="text" class="form-control" id="cut" placeholder="请输入手机验证码">--%>
				<%--<span class="input-group-btn">--%>
					<%--<button class="btn btn-default" type="button">获取验证码</button>--%>
				<%--</span>--%>
    <%--</div>--%>
    <div class="checkbox">
        <label>
            <input type="checkbox">我已阅读并同意<a href="#">《用户注册协议》</a>
        </label>
    </div>
    <%--<button type="button" class="btn btn-danger btn-lg btn-block">立即注册</button>--%>
    <input type="submit" value="立即注册" />
</form>
</body>
</html>

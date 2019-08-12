<%--
  Created by IntelliJ IDEA.
  User: Mr.Tang
  Date: 2019/8/11
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm整合</title>
</head>
<body>
<a href="account/findAll">测试查询</a>
<h3>测试保存</h3>
<form method="post" action="account/save">
    姓名：<input type="text" name="name"><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>

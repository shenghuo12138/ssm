<%--
  Created by IntelliJ IDEA.
  User: Mr.Tang
  Date: 2019/8/11
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<c:forEach items="${list}" var="account">
    ${account.name}${account.money}<br/>
</c:forEach>
</body>
</html>

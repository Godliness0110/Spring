<%--
  Created by IntelliJ IDEA.
  User: Godliness
  Date: 2021/10/18
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加账户信息的表单</h1>
<form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
    账户名称：<input type="text" name="name"><br>
    账户金额：<input type="text" name="money"><br>
    提交<input type="submit" name="保存"><br>
</form>

</body>
</html>

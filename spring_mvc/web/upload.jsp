<%--
  Created by IntelliJ IDEA.
  User: Godliness
  Date: 2021/10/12
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/quick22" method="post" enctype="multipart/form-data">
    名称<input type="text" name="username">
    文件<input type="file" name="upload">
    <input type="submit" name="提交">
</form>

</body>
</html>

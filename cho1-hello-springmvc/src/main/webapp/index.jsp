<%--
  Created by IntelliJ IDEA.
  User: colbert
  Date: 2021/3/12
  Time: 下午6:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交参数</title>
</head>
<body>


    <form action="/view.do" method="post">
        <input type="text" name="name"/><br>
        <input type="text" name="age"><br>
        <input type="submit" name="提交">
    </form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 31343
  Date: 2021/4/24
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello world</title>
</head>
<body>
<h1>JavaWeb - Hello World Servlet Test</h1>
<hr>
<p>This tag handler simply echos "Hello, World!"  It's an example of
    a very basic SimpleTag handler with JavaServlet.</p>
<mytag:helloWorld/>

<form action="${pageContext.request.contextPath}/login_redirect" method="post">
    用户名: <input type="text" name="username"><br>
    密码: <input type="password" name="password"><br>
    <input type="submit">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28/11/2022
  Time: 8:08 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="handleSearchServlet" method="post">
    Search <input type="text" name="search"> <input type="submit"><br>
    <input type="radio" name="radio" value="id"> Id Staff
    <input type="radio" name="radio" value="name"> Name
    <input type="radio" name="radio" value="role"> Role
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/27/2022
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset=UTF-8">
    <title>Login</title>
</head>
<body>
    <h1> HÃY ĐĂNG NHẬP </h1>
    <form action="LoginServlet" method="post">
        <table>
            <tr>
                <th> USERNAME: </th>
                <td> <input type="text" name="user"> </td>
            </tr>
            <tr>
                <th> PASSWORD: </th>
                <td> <input type="password" name="pass"> </td>
            </tr>
            <tr>
                <td> <input type="submit" value="OK"> </td>
                <td> <input type="reset" value="RESET"> </td>
            </tr>
        </table>
    </form>
</body>
</html>

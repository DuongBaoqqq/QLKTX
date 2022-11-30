<%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/28/2022
  Time: 8:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <form action="RegisterServlet" method="post">
      <table>
        <tr>
          <th> USERNAME: </th>
          <td> <input type="text" name="user"> </td>
        </tr>
        <tr>
          <th> PASSWORD: </th>
          <td> <input type="text" name="pass"> </td>
        </tr>
        <tr>
          <td> <input type="submit" value="OK"> </td>
          <td> <input type="reset" value="RESET"> </td>
        </tr>
      </table>
    </form>
</head>
<body>

</body>
</html>

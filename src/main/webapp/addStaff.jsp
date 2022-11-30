<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 28/11/2022
  Time: 6:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="handleAddServlet" method="post">
  <table>
    <tr>
      <th>ID</th>
      <td><input type="text" name="id" ></td>
    </tr>
    <tr>
      <th>Name</th>
      <td><input type="text" name="name" ></td>
    </tr>
    <tr>
      <th>Sex</th>
      <td><input type="text" name="sex" ></td>
    </tr>
    <tr>
      <th>Phone</th>
      <td><input type="text" name="phonenumber" ></td>
    </tr>
    <tr>
      <th>Date</th>
      <td><input type="date" name="date" ></td>
    </tr>
    <tr>
      <th>Role</th>
      <td><input type="text" name="role" ></td>
    </tr>
  </table>
  <input type="submit">
</form>
</body>
</html>

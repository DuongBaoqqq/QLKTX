<%@ page import="com.example.qlktx.models.BEAN.Staff" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 27/11/2022
  Time: 8:10 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UPDATESTAFF</title>
</head>
<body>
<form action="handleUpdateServlet" method="post">
    <% Staff staff = (Staff) request.getAttribute("staff");  %>
    <table>
        <tr>
            <th>ID</th>
            <td><input type="text" name="id" value="<%= staff.getId() %>"></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name" value="<%= staff.getName() %>"></td>
        </tr>
        <tr>
            <th>Sex</th>
            <td><input type="text" name="sex" value="<%= (staff.isSex()==true?"Male":"Female") %>"></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><input type="text" name="phonenumber" value="<%= staff.getPhonenumber() %>"></td>
        </tr>
        <tr>
            <th>Date</th>
            <td><input type="date" name="date" value="<%= staff.getDate() %>"></td>
        </tr>
        <tr>
            <th>Role</th>
            <td><input type="text" name="role" value="<%= staff.getRole() %>"></td>
        </tr>
    </table>
    <input type="submit">
</form>
</body>
</html>

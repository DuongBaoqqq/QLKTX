<%@ page import="com.example.ql_ktx.models.BEAN.Staff" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/28/2022
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <% List<Staff> staffs = (List<Staff>)request.getAttribute("staffs"); %>
</head>
<body>
<title>Staffs</title>
<table border="1">
  <tr>
    <th> ID </th>
    <th> Tên </th>
    <th> Giới tính </th>
    <th> SĐT </th>
    <th> Ngày sinh </th>
    <th> Chức vụ </th>
    <th> Xóa staff </th>
  </tr>
    <% for (Staff staff:staffs) {%>
  <tr>
    <td> <%= staff.getId() %> </td>
    <td> <%= staff.getName() %> </td>
    <td> <%= staff.getSex() %> </td>
    <td> <%= staff.getPhone_number() %> </td>
    <td> <%= staff.getDate() %> </td>
    <td> <%= staff.getRole() %> </td>
    <td> <a href=""> Xóa </a> </td>
  </tr>
    <%}%>
  <%--    <a> <%=rooms%> </a>--%>
</body>
</html>

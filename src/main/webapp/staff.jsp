<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.qlktx.models.BEAN.Staff" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 27/11/2022
  Time: 6:05 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>STAFF</title>
  <style>
    table{
      width:100%
    }
    table, th, td {
      border: 1px solid black;
      border-collapse: collapse;
    }
    tr:nth-child(even) {
      background-color: #D6EEEE;
    }

  </style>
</head>
<body>
<form action="changePagesServlet" method="post">

  <table>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Sex</th>
      <th>Phone Number</th>
      <th>Date</th>
      <th>Role</th>
      <th>Update</th>
      <th>Delete</th>
    </tr>
    <%
      ArrayList<Staff> Staffs = (ArrayList<Staff>) request.getAttribute("staffs");
      for (int i=0; i<Staffs.size(); i++){
    %>
      <tr>
        <td><%= Staffs.get(i).getId()  %></td>
        <td><%= Staffs.get(i).getName()  %></td>
        <td><%= Staffs.get(i).isSex() ? "Male" : "FeMale" %></td>
        <td><%= Staffs.get(i).getPhonenumber()  %></td>
        <td><%= Staffs.get(i).getDate()  %></td>
        <td><%= Staffs.get(i).getRole()  %></td>
        <td><a href="changePagesServlet?id=<%= Staffs.get(i).getId() %>">Update</a></td>
        <td><input type="checkbox" name="del" value="<%= Staffs.get(i).getId() %>"></td>
      </tr>
    <%}%>
  </table>
  <input type="submit" value="Add Staff" name="submitAdd">
  <input type="submit" value="Delete" name="submitDel">
</form>
<a href="changePagesServlet?search=1">Search</a>
</body>
</html>

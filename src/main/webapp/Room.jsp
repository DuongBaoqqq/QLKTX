<%@ page import="java.util.List" %>
<%@ page import="com.example.ql_ktx.models.BEAN.Room" %><%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/28/2022
  Time: 1:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <% List<Room> rooms = (List<Room>)request.getAttribute("rooms"); %>
</head>
<body>
<title> DANH SÁCH PHÒNG </title>

<table border="1">
    <tr>
        <th> ID </th>
        <th> Phòng </th>
        <th> Tòa nhà </th>
        <th> Số lượng (SV) </th>
        <th> Chi tiết </th>
        <th> Xóa phòng </th>
    </tr>
        <% for (Room room:rooms) {%>
    <tr>
        <td> <%= room.getId() %> </td>
        <td> <%= room.getName() %> </td>
        <td> <%= room.getBuilding_name() %> </td>
        <td> <%= room.getQuantity() %> </td>
        <td> <a href="ShowStudentServlet"> Xem SV </a> </td>
        <%int id=room.getId();%>
        <td> <a href="DeleteRoomServlet?id=<%=room.getId()%>"> Xóa </a> </td>
    </tr>
        <%}%>
<%--    <a> <%=rooms%> </a>--%>
</table>
</body>
</html>

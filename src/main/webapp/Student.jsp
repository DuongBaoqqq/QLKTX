<%@ page import="java.util.List" %>
<%@ page import="com.example.ql_ktx.models.BEAN.Room" %>
<%@ page import="com.example.ql_ktx.models.BEAN.Student" %><%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/28/2022
  Time: 1:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <% List<Student> students = (List<Student>)request.getAttribute("students"); %>
</head>
<body style="text-align: center">
<title> DANH SÁCH PHÒNG </title>
<form action="AddInforStudentServlet">
    <input type="submit" value="Add">
</form>
<table border="1">
    <tr>
        <th> ID </th>
        <th> Phòng </th>
        <th> Tên </th>
        <th> Ngày sinh </th>
        <th> Giới tính </th>
        <th> CCCD </th>
        <th> SĐT </th>
        <th> Trường </th>
        <th> Khoa </th>
        <th> Lớp </th>
        <th> Ngày bắt đầu </th>
        <th> Ngày hết hạn </th>
        <th> Xóa SV </th>
        <th> Cập nhật SV </th>
    </tr>
    <% for (Student student:students) {%>
    <tr>
        <td> <%= student.getId() %> </td>
        <td> <%= student.getRoom_name() %> </td>
        <td> <%= student.getName() %> </td>
        <td> <%= student.getDate() %> </td>
        <td>
            <%if (student.getSex()==1)%>
                <%= "Nam" %>
            <%if (student.getSex()==0)%>
            <%= "Nu" %>
        </td>
        <td> <%= student.getCccd() %> </td>
        <td> <%= student.getPhone_number() %> </td>
        <td> <%= student.getUni() %> </td>
        <td> <%= student.getFaculty() %> </td>
        <td> <%= student.get_class() %> </td>
        <td> <%= student.getDate_from() %> </td>
        <td> <%= student.getDate_to() %> </td>
        <td> <a href="DeleteStudentServlet?id=<%=student.getId()%>"> Del </a> </td>
        <td> <a href="ChangeInforStudentServlet?id=<%=student.getId()%>&room_name=<%=student.getRoom_name()%>&name=<%=student.getName()%>&date=<%=student.getDate()%>&sex=<%=student.getSex()%>&cccd=<%=student.getCccd()%>&phone_number=<%=student.getPhone_number()%>&uni=<%=student.getUni()%>&faculty=<%=student.getFaculty()%>&class=<%=student.get_class()%>&date_from=<%=student.getDate_from()%>&date_to=<%=student.getDate_to()%>"> Change </a> </td>
    </tr>
    <%}%>
    <%--    <a> <%=rooms%> </a>--%>
</table>
</body>
</html>

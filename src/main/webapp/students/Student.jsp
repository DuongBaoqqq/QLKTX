<%@ page import="java.util.List" %>
<%@ page import="com.example.qlktx.models.BEAN.Room" %>
<%@ page import="com.example.qlktx.models.BEAN.Student" %><%--
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
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            border: 1px solid black;
            width: 250px;
            font-size: 18px;
        }
        th {
            background-color: cornflowerblue;
        }
    </style>
</head>

    <body style="text-align: center">
    <title> DANH SÁCH PHÒNG </title>

    <form action="SearchStudentServlet">    <%--Form search--%>
        Name: <input type="text" name="name" value="" class="text">
        <button type="submit" class="button"><svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="5" height="5"><path fill="none" d="M0 0h24v24H0z"/><path d="M18.031 16.617l4.283 4.282-1.415 1.415-4.282-4.283A8.96 8.96 0 0 1 11 20c-4.968 0-9-4.032-9-9s4.032-9 9-9 9 4.032 9 9a8.96 8.96 0 0 1-1.969 5.617zm-2.006-.742A6.977 6.977 0 0 0 18 11c0-3.868-3.133-7-7-7-3.868 0-7 3.132-7 7 0 3.867 3.132 7 7 7a6.977 6.977 0 0 0 4.875-1.975l.15-.15z"/></svg></button>
        <br>
        <input type="reset" value="Reset">
    </form>
    
    <form action="AddInforStudentServlet">      <%--Form show--%>
        <input type="submit" value="Add">
    </form>

    <table>
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

<%@ page import="com.example.qlktx.models.BEAN.Room" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/29/2022
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <% List<Room> rooms = (List<Room>)request.getAttribute("rooms_names"); %>
  <title>Infor</title>

</head>
<body>
<form method="post" action="UpdateStudentServlet">
  <table>
    <tr>
      <th>ID:</th>
      <td><input type="text" readonly name="id_std" value="<%=request.getParameter("id")%>"></td>
    </tr>
    <tr>
      <th>Phòng:</th>
      <td><select name="roomSelect">
          <%for (Room r:rooms) {%>
        <option value="<%=r.getId()%>"> <%=r.getName()%> </option>
          <%}%>
      </td>

    </tr>
    <tr>
      <th>Tên:</th>
      <td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>
    </tr>
    <tr>
      <th>Ngày sinh:</th>
      <td><input type="date" name="date" value="<%=request.getParameter("date")%>"></td>
    </tr>
    <tr>
      <th>Giới tính:</th>
      <td>
        <select name="sex">
          <option value="1"> Nam </option>
          <option value="0"> Nữ </option>
        </select>
      </td>
<%--      <td><input type="text" id="sex" value="<%=request.getParameter("sex")%>"></td>--%>
    </tr>
    <tr>
      <th>CCCD:</th>
      <td><input type="text" name="cccd" value="<%=request.getParameter("cccd")%>"></td>
    </tr>
    <tr>
      <th>SĐT:</th>
      <td><input type="text" name="phone_number" value="<%=request.getParameter("phone_number")%>"></td>
    </tr>
    <tr>
      <th>Trường:</th>
      <td><input type="text" name="uni" value="<%=request.getParameter("uni")%>"></td>
    </tr>
    <tr>
      <th>Khoa:</th>
      <td><input type="text" name="faculty" value="<%=request.getParameter("faculty")%>"></td>
    </tr>
    <tr>
      <th>Lớp:</th>
      <td><input type="text" name="class" value="<%=request.getParameter("class")%>"></td>
    </tr>
    <tr>
      <th>Ngày bắt đầu:</th>
      <td><input type="date" name="date_from" value="<%=request.getParameter("date_from")%>"></td>
    </tr>
    <tr>
      <th>Ngày hết hạn:</th>
      <td><input type="date" name="date_to" value="<%=request.getParameter("date_to")%>"></td>
    </tr>
<%--    <tr>--%>
<%--      --%>
<%--&lt;%&ndash;      <td><input type="reset" value="Reset"></td>&ndash;%&gt;--%>
<%--    </tr>--%>
  </table>
    <td><input type="submit" value="Update"></td>
</form>

<form action="ShowStudentServlet">
    <input type="submit" value="Back">
</form>
</body>
</html>

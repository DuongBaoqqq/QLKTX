<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 01/12/2022
  Time: 2:01 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.qlktx.models.BEAN.Room" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: desti
  Date: 11/26/2022
  Time: 6:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <style>
    *{
      font-family: Consolas;
    }
    table {
      padding: 2rem;
      border-collapse: collapse;
    }
    td {
      padding: 1rem 3rem;
      border: solid 1px black;
    }
    thead > tr > td {
      font-weight: bold;
    }
    .table-container{
      display: flex;
      justify-content: center;
    }
    .container {
      max-width: 1100px;
      margin: 0 auto;
    }
    .center {
      display: flex;
      justify-content: center;
      align-items: center;
    }
  </style>
</head>
<body>
<div class="container"  style="padding: 2rem">
  <div style="display: flex ; justify-content: space-between ; align-items: center">
    <h1 style="padding: 0 3rem">Room Management</h1>



    <div style="">
      <a style="text-decoration: none ; border: solid 1px black ; color: black ;
                 padding: 0.2rem 0.5rem ; border-radius: 10px" href="rooms/add-room">+ Add room</a>
    </div>



  </div>

  <div style="float: right;">
    <div>

    </div>

    <form action="" style="display: flex;align-items: center; gap: 1rem" method="get">
      <label>
        <input name="available"
               value="1" type="checkbox">
        available room
      </label>
      <input name="room_name" value="" style="padding: 0.5rem 1rem" placeholder="Enter room name...">
      <button type="submit" role="button" style="border-radius: 50%;width: 30px ; height: 30px ; cursor: pointer" class="center"><svg   xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="24" height="24"><path fill="none" d="M0 0h24v24H0z"/><path d="M18.031 16.617l4.283 4.282-1.415 1.415-4.282-4.283A8.96 8.96 0 0 1 11 20c-4.968 0-9-4.032-9-9s4.032-9 9-9 9 4.032 9 9a8.96 8.96 0 0 1-1.969 5.617zm-2.006-.742A6.977 6.977 0 0 0 18 11c0-3.868-3.133-7-7-7-3.868 0-7 3.132-7 7 0 3.867 3.132 7 7 7a6.977 6.977 0 0 0 4.875-1.975l.15-.15z"/></svg></button>
    </form>

  </div>

  <div style="clear: both ;margin-top: 5rem" class="table-container">

    <table>
      <thead>
      <tr>
        <td>
          Room
        </td>

        <td>
          Building
        </td>

        <td>
          Quantity
        </td>
        <td></td>

        <td></td>
      </tr>

      </thead>

      <tbody style="text-align: center">
      <%
        ArrayList<Room> rooms = (ArrayList<Room>)request.getAttribute("rooms");
        for (Room room: rooms
        ) {
      %>
      <tr>
        <td ><%= room.getName()  %></td>
        <td><%= room.getBuildingName()  %></td>
        <td><%= room.getNumStudent() + "/" + room.getQuantity()%></td>
        <td><a href="rooms.jsp">Detail</a></td>
        <td>Delete</td>
      </tr>

      <% }%>
      <tr>

      </tr>

      </tbody>

    </table>

  </div>

</div>
</body>
</html>

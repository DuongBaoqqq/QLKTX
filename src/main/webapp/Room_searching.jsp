<%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/28/2022
  Time: 6:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<form name="form1" action="SearchRoomServlet" method='post'>
  <table>
    <tr>
      <th> <input type="radio" id="id" name="select" value="ID"> ID </th>
      <th> <input type="radio" id="hoten" name="select" value="Ten phong"> Ten phong </th>
      <th> <input type="radio" id="diachi" name="select" value="So luong"> So luong </th>
    </tr>
    <tr>
      <th> <div> Nhap vao thong tin: </div> </th>
      <th> <input type="text" name="txt"> </th>
    </tr>
    <tr>
      <th> </th>
      <th>
        <input type="submit" name="b_OK" value="OK" onclick="Xuli()"/>
        <input type="reset" name="b_reset" value="Reset"/>
      </th>
    </tr>
  </table>
</form>

<caption>Du lieu bang Nhan vien</caption>
<tr>
  <th>ID NV</th>
  <th>Ho ten</th>
  <th>Phong ban</th>
  <th>Dia chi</th>
</tr>

<tr>
  <td>".$i->idnv."</td>
  <td>".$i->tennv."</td>
  <td>".$i->tenpb."</td>
  <td>".$i->diachi."</td>
</tr>

</table>
</body>
</html>

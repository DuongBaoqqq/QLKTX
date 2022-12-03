<%@ page import="com.example.qlktx.models.BEAN.Room" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LONG HOANG
  Date: 11/29/2022
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>DASHMIN - Bootstrap Admin Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <%--  href="/includes/asserts/css/bootstrap.min.css"--%>
    <%--  href="${pageContext.request.contextPath}/css/styles.css"--%>
    <link href="${pageContext.request.contextPath}/template/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/template/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" type="text/css" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="${pageContext.request.contextPath}/template/css/bootstrap.min.css" rel="stylesheet" type="text/css">

    <!-- Template Stylesheet -->
    <link href="${pageContext.request.contextPath}/template/css/style.css" rel="stylesheet" type="text/css">

    <% List<Room> rooms = (List<Room>)request.getAttribute("rooms_names"); %>--%>
</head>

<body>
<div class="container-xxl position-relative bg-white d-flex p-0">
    <!-- Spinner Start -->
    <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
        <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
            <span class="sr-only">Loading...</span>
        </div>
    </div>
    <!-- Spinner End -->


    <!-- Sidebar Start -->
    <div class="sidebar pe-4 pb-3">
        <nav class="navbar bg-light navbar-light">
            <a href="${pageContext.request.contextPath}" class="navbar-brand mx-4 mb-3">
                <h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>KTX</h3>
            </a>
            <div class="d-flex align-items-center ms-4 mb-4">

                <div class="ms-3">
                    <h6 class="mb-0"><%=request.getSession().getAttribute("username")%></h6>
                    <span>Admin</span>
                </div>
            </div>
            <div class="navbar-nav w-100">
                <a href="${pageContext.request.contextPath}" class="nav-item nav-link "><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle active" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Student</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="${pageContext.request.contextPath}/ShowStudentServlet" class="dropdown-item">List Student</a>
                        <a href="${pageContext.request.contextPath}/AddInforStudentServlet" class="dropdown-item">Add Student</a>
                    </div>
                </div>

                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Room</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="${pageContext.request.contextPath}/rooms" class="dropdown-item">List room</a>
                        <a href="${pageContext.request.contextPath}/rooms/add-room" class="dropdown-item">Add Room</a>
                    </div>
                </div>

                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Staff</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="${pageContext.request.contextPath}/staffServlet" class="dropdown-item">List staff</a>
                        <a href="${pageContext.request.contextPath}/staffControllerServlet?submitAdd=1" class="dropdown-item">Add staff</a>
                    </div>
                </div>
                <div class="nav-item ">
                    <a href="${pageContext.request.contextPath}/addAdminServlet" class="nav-link "><i class="fa fa-laptop me-2"></i>Add admin</a>
                </div>

                <a  href="${pageContext.request.contextPath}/LogoutServlet" class="nav-item nav-link"><i class="fa fa-th me-2"></i>Logout</a>

            </div>
        </nav>
    </div>
    <!-- Sidebar End -->


    <!-- Content Start -->
    <div class="content">
        <!-- Navbar Start -->
        <nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-3">
            <a href="index.html" class="navbar-brand d-flex d-lg-none me-4">
                <h2 class="text-primary mb-0"><i class="fa fa-hashtag"></i></h2>
            </a>
            <a href="#" class="sidebar-toggler flex-shrink-0">
                <i class="fa fa-bars"></i>
            </a>
            <form action="rooms" method="get" class="d-none d-md-flex ms-4">
                <input class="form-control border-0" name="room_name" type="search" placeholder="Search">
            </form>
        </nav>
        <!-- Navbar End -->



        <!-- Recent Sales Start -->
        <div class="container-fluid pt-4 ">
            <div class="bg-light text-center rounded p-4">
                <div class="d-flex align-items-center justify-content-between mb-4">
                    <h6 class="mb-0">Add new student</h6>
                </div>

                <form method="post" action="UpdateStudentServlet" class="text-start">

                    <div class="row mb-3">
                        <label for="Name" class="col-sm-2 col-form-label">ID</label>
                        <div class="col-sm-10">
                            <input type="text" name="id_std" value="<%=request.getParameter("id")%>" class="form-control" id="id">
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label class="col-sm-2 col-form-label">Room</label>
                        <div class="col-sm-10">
                            <select name="roomSelect" id="roomSelect" class="form-select form-select-sm" aria-label=".form-select-sm example">
                                <%for (Room r:rooms) {%>
                                <option value="<%=r.getId()%>"> <%=r.getName()%> </option>
                                <%}%>
                            </select>
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="Name" class="col-sm-2 col-form-label">Name</label>
                        <div class="col-sm-10">
                            <input type="text" name="name" value="<%=request.getParameter("name")%>" class="form-control" id="Name">
                        </div>
                    </div>


                    <div class="row mb-3">
                        <label for="inputPassword3" class="col-sm-2 col-form-label">Date of birth</label>
                        <div class="col-sm-10">
                            <input type="date" name="date" class="form-control"  value="<%=request.getParameter("date")%>" id="inputPassword3">
                        </div>
                    </div>


                    <div class="row mb-3">
                        <label class="col-sm-2 col-form-label">Sex</label>
                        <div class="col-sm-10">
                            <select name="sex" id="Sex"  value="<%=request.getParameter("sex")%>" class="form-select form-select-sm" aria-label=".form-select-sm example">
                                <option value="1">Male</option>
                                <option value="0">Female</option>
                            </select>
                        </div>
                    </div>


                    <div class="row mb-3">
                        <label for="CCCD" class="col-sm-2 col-form-label">CCCD</label>
                        <div class="col-sm-10">
                            <input type="text" name="cccd" value="<%=request.getParameter("cccd")%>" class="form-control" id="CCCD" >
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="phone" class="col-sm-2 col-form-label">Phone number</label>
                        <div class="col-sm-10">
                            <input type="text" name="phone_number" value="<%=request.getParameter("phone_number")%>" class="form-control" id="phone" >
                        </div>
                    </div>


                    <div class="row mb-3">
                        <label for="University" class="col-sm-2 col-form-label">University</label>
                        <div class="col-sm-10">
                            <input type="text" name="uni" value="<%=request.getParameter("uni")%>" class="form-control" id="University" >
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="Faculty" class="col-sm-2 col-form-label">Faculty</label>
                        <div class="col-sm-10">
                            <input type="text" name="faculty" value="<%=request.getParameter("faculty")%>" class="form-control" id="Faculty" >
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="Class" class="col-sm-2 col-form-label">Class</label>
                        <div class="col-sm-10">
                            <input type="text" name="class" value="<%=request.getParameter("class")%>" class="form-control" id="Class" >
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="Start_Date" class="col-sm-2 col-form-label">Start Date</label>
                        <div class="col-sm-10">
                            <input type="date" class="form-control" value="<%=request.getParameter("date_from")%>" name="date_from" id="Start_Date">
                        </div>
                    </div>

                    <div class="row mb-3">
                        <label for="End_Date" class="col-sm-2 col-form-label">End Date</label>
                        <div class="col-sm-10">
                            <input type="date" class="form-control" value="<%=request.getParameter("date_to")%>" name="date_to" id="End_Date">
                        </div>
                    </div>


                    <button type="submit" class="btn btn-primary px-5">Update</button>
                </form>


            </div>
        </div>
        <!-- Recent Sales End -->

        <!-- Content End -->




    </div>
    <!-- Content End -->


</div>

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/chart/chart.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/easing/easing.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/waypoints/waypoints.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/owlcarousel/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/tempusdominus/js/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/tempusdominus/js/moment-timezone.min.js"></script>
<script src="${pageContext.request.contextPath}/template/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

<!-- Template Javascript -->
<script src="${pageContext.request.contextPath}/template/js/main.js"></script>
</body>

</html>




<%--<html>--%>
<%--<head>--%>
<%--  <% List<Room> rooms = (List<Room>)request.getAttribute("rooms_names"); %>--%>
<%--  <title>Infor</title>--%>

<%--</head>--%>
<%--<body>--%>
<%--<form method="post" action="UpdateStudentServlet">--%>
<%--  <table>--%>
<%--    <tr>--%>
<%--      <th>ID:</th>--%>
<%--      <td><input type="text" readonly name="id_std" value="<%=request.getParameter("id")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Phòng:</th>--%>
<%--      <td><select name="roomSelect">--%>
<%--          <%for (Room r:rooms) {%>--%>
<%--        <option value="<%=r.getId()%>"> <%=r.getName()%> </option>--%>
<%--          <%}%>--%>
<%--      </td>--%>

<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Tên:</th>--%>
<%--      <td><input type="text" name="name" value="<%=request.getParameter("name")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Ngày sinh:</th>--%>
<%--      <td><input type="date" name="date" value="<%=request.getParameter("date")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Giới tính:</th>--%>
<%--      <td>--%>
<%--        <select name="sex">--%>
<%--          <option value="1"> Nam </option>--%>
<%--          <option value="0"> Nữ </option>--%>
<%--        </select>--%>
<%--      </td>--%>
<%--&lt;%&ndash;      <td><input type="text" id="sex" value="<%=request.getParameter("sex")%>"></td>&ndash;%&gt;--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>CCCD:</th>--%>
<%--      <td><input type="text" name="cccd" value="<%=request.getParameter("cccd")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>SĐT:</th>--%>
<%--      <td><input type="text" name="phone_number" value="<%=request.getParameter("phone_number")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Trường:</th>--%>
<%--      <td><input type="text" name="uni" value="<%=request.getParameter("uni")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Khoa:</th>--%>
<%--      <td><input type="text" name="faculty" value="<%=request.getParameter("faculty")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Lớp:</th>--%>
<%--      <td><input type="text" name="class" value="<%=request.getParameter("class")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Ngày bắt đầu:</th>--%>
<%--      <td><input type="date" name="date_from" value="<%=request.getParameter("date_from")%>"></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--      <th>Ngày hết hạn:</th>--%>
<%--      <td><input type="date" name="date_to" value="<%=request.getParameter("date_to")%>"></td>--%>
<%--    </tr>--%>
<%--&lt;%&ndash;    <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;      &ndash;%&gt;--%>
<%--&lt;%&ndash;&lt;%&ndash;      <td><input type="reset" value="Reset"></td>&ndash;%&gt;&ndash;%&gt;--%>
<%--&lt;%&ndash;    </tr>&ndash;%&gt;--%>
<%--  </table>--%>
<%--    <td><input type="submit" value="Update"></td>--%>
<%--</form>--%>

<%--<form action="ShowStudentServlet">--%>
<%--    <input type="submit" value="Back">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>

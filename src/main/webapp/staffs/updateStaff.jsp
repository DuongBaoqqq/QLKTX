<%--<%@ page import="com.example.qlktx.models.BEAN.Staff" %>&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: HP--%>
<%--  Date: 27/11/2022--%>
<%--  Time: 8:10 CH--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java"--%>
<%--pageEncoding="utf-8"--%>
<%--%>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>UPDATESTAFF</title>--%>
<%--    <style>--%>

<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="staffControllerServlet" method="post">--%>
<%--    <% Staff staff = (Staff) request.getAttribute("staff");  %>--%>
<%--    <table>--%>
<%--        <tr>--%>
<%--            <th>ID</th>--%>
<%--            <td><input type="text" name="id" value="<%= staff.getId() %>"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Name</th>--%>
<%--            <td><input type="text" name="name" value="<%= staff.getName() %>"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Sex</th>--%>
<%--            <td>--%>
<%--&lt;%&ndash;                <input type="text" name="sex" value="<%= (staff.isSex()==true?"Male":"Female") %>">&ndash;%&gt;--%>
<%--                <select name="sex" id="" >--%>
<%--                    <option value="true"--%>
<%--                            <%--%>
<%--                                if (staff.isSex()==true){--%>
<%--                            %>--%>
<%--                            <%="selected=\"selected\""%>--%>
<%--                            <%}%>--%>
<%--                    >Male</option>--%>
<%--                    <option value="false"--%>
<%--                            <%--%>
<%--                                if (staff.isSex()==false){--%>
<%--                            %>--%>
<%--                            <%="selected=\"selected\""%>--%>
<%--                            <%}%>--%>
<%--                    >Female</option>--%>
<%--                </select>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Phone</th>--%>
<%--            <td><input type="text" name="phonenumber" value="<%= staff.getPhonenumber() %>"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Date</th>--%>
<%--            <td><input type="date" name="date" value="<%= staff.getDate() %>"></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th>Role</th>--%>
<%--            <td><input type="text" name="role" value="<%= staff.getRole() %>"></td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--    <input type="submit" name="updateStaff">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page import="com.example.qlktx.models.BEAN.Staff" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!DOCTYPE html>
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
    <link href="template/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="template/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="template/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="template/css/style.css" rel="stylesheet">
</head>

<body>
<% Staff staff = (Staff) request.getAttribute("staff");  %>
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
            <a href="/" class="navbar-brand mx-4 mb-3">
                <h3 class="text-primary"><i class="fa fa-hashtag me-2"></i>KTX</h3>
            </a>
            <div class="d-flex align-items-center ms-4 mb-4">
                <div class="position-relative">
                    <img class="rounded-circle" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                    <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
                </div>
                <div class="ms-3">
                    <h6 class="mb-0">tieanh</h6>
                    <span>Admin</span>
                </div>
            </div>
            <div class="navbar-nav w-100">
                <a href="/" class="nav-item nav-link active"><i class="fa fa-tachometer-alt me-2"></i>Dashboard</a>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Student</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="ShowStudentServlet" class="dropdown-item">List Student</a>
                        <a href="AddStudentServlet" class="dropdown-item">Add Student</a>
                    </div>
                </div>

                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Room</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="rooms" class="dropdown-item">List room</a>
                        <a href="rooms/add-room" class="dropdown-item">Add Room</a>
                    </div>
                </div>

                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Staff</a>
                    <div class="dropdown-menu bg-transparent border-0">
                        <a href="staffServlet" class="dropdown-item">List staff</a>
                        <a href="staffControllerServlet?submitAdd=1" class="dropdown-item">Add staff</a>
                    </div>
                </div>

                <a href="" class="nav-item nav-link"><i class="fa fa-th me-2"></i>Logout</a>

            </div>
        </nav>
    </div>
    <!-- Sidebar End -->


    <!-- Content Start -->
    <div class="content">
        <!-- Navbar Start -->
        <nav class="navbar navbar-expand bg-light navbar-light sticky-top px-4 py-0">
            <a href="index.html" class="navbar-brand d-flex d-lg-none me-4">
                <h2 class="text-primary mb-0"><i class="fa fa-hashtag"></i></h2>
            </a>
            <a href="#" class="sidebar-toggler flex-shrink-0">
                <i class="fa fa-bars"></i>
            </a>
            <form class="d-none d-md-flex ms-4">
                <input class="form-control border-0" type="search" placeholder="Search">
            </form>
            <div class="navbar-nav align-items-center ms-auto">
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                        <i class="fa fa-envelope me-lg-2"></i>
                        <span class="d-none d-lg-inline-flex">Message</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                        <a href="#" class="dropdown-item">
                            <div class="d-flex align-items-center">
                                <img class="rounded-circle" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                                <div class="ms-2">
                                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                                    <small>15 minutes ago</small>
                                </div>
                            </div>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item">
                            <div class="d-flex align-items-center">
                                <img class="rounded-circle" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                                <div class="ms-2">
                                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                                    <small>15 minutes ago</small>
                                </div>
                            </div>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item">
                            <div class="d-flex align-items-center">
                                <img class="rounded-circle" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                                <div class="ms-2">
                                    <h6 class="fw-normal mb-0">Jhon send you a message</h6>
                                    <small>15 minutes ago</small>
                                </div>
                            </div>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item text-center">See all message</a>
                    </div>
                </div>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                        <i class="fa fa-bell me-lg-2"></i>
                        <span class="d-none d-lg-inline-flex">Notificatin</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                        <a href="#" class="dropdown-item">
                            <h6 class="fw-normal mb-0">Profile updated</h6>
                            <small>15 minutes ago</small>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item">
                            <h6 class="fw-normal mb-0">New user added</h6>
                            <small>15 minutes ago</small>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item">
                            <h6 class="fw-normal mb-0">Password changed</h6>
                            <small>15 minutes ago</small>
                        </a>
                        <hr class="dropdown-divider">
                        <a href="#" class="dropdown-item text-center">See all notifications</a>
                    </div>
                </div>
                <div class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                        <img class="rounded-circle me-lg-2" src="img/user.jpg" alt="" style="width: 40px; height: 40px;">
                        <span class="d-none d-lg-inline-flex">John Doe</span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-end bg-light border-0 rounded-0 rounded-bottom m-0">
                        <a href="#" class="dropdown-item">My Profile</a>
                        <a href="#" class="dropdown-item">Settings</a>
                        <a href="#" class="dropdown-item">Log Out</a>
                    </div>
                </div>
            </div>
        </nav>
        <!-- Navbar End -->
        <div class="container-fluid pt-4 px-4">
            <div class="row g-4">
                <div class="col-sm-12 col-xl-6">
                    <div class="bg-light rounded h-100 p-4">
                        <h6 class="mb-4">Basic Form</h6>
                        <form action="staffControllerServlet" method="post">
                            <div class="mb-3">
                                <label  class="form-label">ID</label>
                                <input type="text" class="form-control"
                                        name="id" value="<%= staff.getId() %>">
                            </div>
                            <div class="mb-3">
                                <label  class="form-label">Name</label>
                                <input type="text" class="form-control"
                                       aria-describedby="emailHelp" name="name" value="<%= staff.getName() %>">
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Sex</label>
                                <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" name="sex">
                                    <option value="true"
                                        <%
                                            if (staff.isSex()==true){
                                        %>
                                        <%="selected=\"selected\""%>
                                        <%}%>
                                    >Male</option>
                                    <option value="false"
                                        <%
                                            if (staff.isSex()==false){
                                        %>
                                        <%="selected=\"selected\""%>
                                        <%}%>
                                    >Female</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label  class="form-label">Phone</label>
                                <input type="text" class="form-control" name="phonenumber" value="<%= staff.getPhonenumber() %>">
                            </div>
                            <div class="mb-3">
                                <label  class="form-label">Date</label>
                                <input type="date" class="form-control" name="date" value="<%= staff.getDate() %>">
                            </div>
                            <div class="mb-3">
                                <label  class="form-label">Role</label>
                                <input type="text" class="form-control" name="role" value="<%= staff.getRole() %>">
                            </div>

                            <button type="submit" class="btn btn-primary"  name="updateStaff">Update</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Content End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
</div>

<!-- JavaScript Libraries -->
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="template/lib/chart/chart.min.js"></script>
<script src="template/lib/easing/easing.min.js"></script>
<script src="template/lib/waypoints/waypoints.min.js"></script>
<script src="template/lib/owlcarousel/owl.carousel.min.js"></script>
<script src="template/lib/tempusdominus/js/moment.min.js"></script>
<script src="template/lib/tempusdominus/js/moment-timezone.min.js"></script>
<script src="template/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

<!-- Template Javascript -->
<script src="template/js/main.js"></script>

</body>

</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="./template/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="./template/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="./template/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="./template/css/style.css" rel="stylesheet">
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<a href="staffServlet">Hello Servlet</a>
<a href="rooms">room</a>
<a href="ShowStudentServlet">student</a>

<div class="col-sm-12 col-xl-6">
    <div class="bg-light rounded h-100 p-4">
        <h6 class="mb-4">Bordered Table</h6>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>John</td>
                <td>Doe</td>
                <td>jhon@email.com</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td>Mark</td>
                <td>Otto</td>
                <td>mark@email.com</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td>Jacob</td>
                <td>Thornton</td>
                <td>jacob@email.com</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
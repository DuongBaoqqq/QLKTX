package com.example.qlktx.controllers.admin;

import com.example.qlktx.models.BO.AdminBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addAdminServlet", value = "/addAdminServlet")
public class addAdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/admin/addAdmin.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        AdminBO.insertAdmin(username, password);
        response.sendRedirect(request.getContextPath());
    }
}

package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "handleSearchServlet", value = "/handleSearchServlet")
public class handleSearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("radio");
        String search = request.getParameter("search");
        List<Staff> staffs = new ArrayList<>();
        staffs = StaffBO.SearchStaff(type,search);
        request.setAttribute("staffs",staffs);
        RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/staff.jsp");
        rd.forward(request,response);
    }
}

package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShowStaffServlet", value = "/ShowStaffServlet")
public class ShowStaffServlet extends HttpServlet {
    public ShowStaffServlet()
    {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("staffs", StaffBO.getStaffs());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/showStaff.jsp");
        rd.forward(request, response);
    }
}

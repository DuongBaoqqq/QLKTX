package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.RoomBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddInforStudentServlet", value = "/AddInforStudentServlet")
public class AddInforStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rooms_names", RoomBO.getRooms());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddStudent.jsp");
        rd.forward(request, response);
    }
}
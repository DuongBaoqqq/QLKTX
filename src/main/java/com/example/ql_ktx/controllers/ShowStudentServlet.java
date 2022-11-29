package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.RoomBO;
import com.example.ql_ktx.models.BO.StudentBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShowStudentServlet", value = "/ShowStudentServlet")
public class ShowStudentServlet extends HttpServlet {
    public ShowStudentServlet()
    {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", StudentBO.getStudent());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Student.jsp");
        rd.forward(request, response);

    }
}

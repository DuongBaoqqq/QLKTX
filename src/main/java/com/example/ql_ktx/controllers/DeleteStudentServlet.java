package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.RoomBO;
import com.example.ql_ktx.models.BO.StudentBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "DeleteStudentServlet", value = "/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentBO.deleteStudent(id);
        request.setAttribute("students", StudentBO.getStudent());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Student.jsp");
        rd.forward(request, response);
    }
}

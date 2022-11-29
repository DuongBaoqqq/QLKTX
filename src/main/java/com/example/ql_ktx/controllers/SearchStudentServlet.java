package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.StudentBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchStudentServlet", value = "/SearchStudentServlet")
public class SearchStudentServlet extends HttpServlet {
    public SearchStudentServlet()
    {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", StudentBO.getStudentsByName(request.getParameter("name")));
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Student.jsp");
        rd.forward(request, response);
    }
}

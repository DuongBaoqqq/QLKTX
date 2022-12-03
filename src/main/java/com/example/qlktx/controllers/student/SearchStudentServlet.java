package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.StudentBO;
import com.example.qlktx.models.BO.StudentBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        if (request.getSession().getAttribute("username") == null)
            response.sendRedirect(request.getContextPath() + "/CheckLoginServlet");
        else {
            request.setAttribute("students", StudentBO.getStudentsByName(request.getParameter("name")));
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/students/Student.jsp");
            rd.forward(request, response);
        }
    }
}

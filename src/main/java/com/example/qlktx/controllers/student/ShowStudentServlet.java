package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.StudentBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/students/Student.jsp");
        rd.forward(request, response);

    }
}

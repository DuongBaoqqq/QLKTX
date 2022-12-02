package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.StudentBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ShowStudentViaRoomServlet", value = "/ShowStudentViaRoomServlet")
public class ShowStudentViaRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("students", StudentBO.getStudentsByRoom(request.getParameter("room_name")));
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/students/Student.jsp");
        rd.forward(request, response);
    }
}

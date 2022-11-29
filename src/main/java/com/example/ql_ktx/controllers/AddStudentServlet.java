package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.RoomBO;
import com.example.ql_ktx.models.BO.StudentBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddStudentServlet", value = "/AddStudentServlet")
public class AddStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id_room = Integer.parseInt(request.getParameter("roomSelect"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        int sex = Integer.parseInt(request.getParameter("sex"));
        String cccd = request.getParameter("cccd");
        String phone_number = request.getParameter("phone_number");
        String uni = request.getParameter("uni");
        String faculty = request.getParameter("faculty");
        String _class = request.getParameter("class");
        String date_from = request.getParameter("date_from");
        String date_to = request.getParameter("date_to");
        StudentBO.addStudent(id_room, name, date, sex, cccd, phone_number, uni, faculty, _class, date_from, date_to);
//        request.setAttribute("students", StudentBO.getStudent());
        request.setAttribute("rooms_names", RoomBO.getRooms());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/AddStudent.jsp");
        rd.forward(request, response);
    }
}

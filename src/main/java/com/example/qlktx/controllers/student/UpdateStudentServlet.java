package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.StudentBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UpdateStudentServlet", value = "/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
    public UpdateStudentServlet()
    {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id_std"));
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
        StudentBO.updateStudent(id, id_room, name, date, sex, cccd, phone_number, uni, faculty, _class, date_from, date_to);
        request.setAttribute("students", StudentBO.getStudent());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Student.jsp");
        rd.forward(request, response);
    }
}

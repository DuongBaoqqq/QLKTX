package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.RoomBO;
import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ChangeInforStudentServlet", value = "/ChangeInforStudentServlet")
public class ChangeInforStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("rooms_names", RoomBO.getRooms("", false));
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/students/UpdateStudent.jsp");
        rd.forward(request, response);
    }
}

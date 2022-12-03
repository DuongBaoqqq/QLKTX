package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddInforStudentServlet", value = "/AddInforStudentServlet")
public class AddInforStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("username")==null) response.sendRedirect(request.getContextPath()+"/CheckLoginServlet");
        else {
            request.setAttribute("rooms_names", RoomBO.getRooms("", false));
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/students/AddStudent.jsp");
            rd.forward(request, response);
        }
    }
}

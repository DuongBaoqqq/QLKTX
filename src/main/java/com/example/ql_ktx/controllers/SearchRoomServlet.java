package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BO.RoomBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchRoomServlet", value = "/SearchRoomServlet")
public class SearchRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String select = request.getParameter("select");
        String txt = request.getParameter("txt");
        request.setAttribute("rooms", RoomBO.seachRoom(select, txt));

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Room.jsp");
        rd.forward(request, response);
    }
}

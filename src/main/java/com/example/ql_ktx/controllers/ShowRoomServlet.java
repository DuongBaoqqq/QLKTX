package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BEAN.Room;
import com.example.ql_ktx.models.BO.RoomBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowRoomServlet", value = "/ShowRoomServlet")
public class ShowRoomServlet extends HttpServlet {
//    RoomBO roombo;
    public  ShowRoomServlet()
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("rooms", RoomBO.getRooms());
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Room.jsp");
        rd.forward(request, response);
//        response.sendRedirect("Room.jsp");
    }
}

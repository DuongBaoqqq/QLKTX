package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BEAN.Room;
import com.example.ql_ktx.models.BO.RoomBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static java.lang.System.out;

@WebServlet(name = "DeleteRoomServlet", value = "/DeleteRoomServlet")
public class DeleteRoomServlet extends HttpServlet {
    public DeleteRoomServlet()
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
        String s_id = request.getParameter("id");
        out.println(request.getParameter("id"));
        int id = Integer.parseInt(s_id);
        RoomBO.delRoom(id);
    }
}

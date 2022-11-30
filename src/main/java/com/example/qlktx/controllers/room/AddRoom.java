package com.example.qlktx.controllers.room;

import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddRoom" , value = "/rooms/add-room")
public class AddRoom extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("add-room.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int building_id = Integer.parseInt(req.getParameter("building_id"));
        String name = req.getParameter("name");
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        System.out.println("hello");
        RoomBO.addNewRoom(building_id, name , quantity);

        resp.sendRedirect("/rooms");
    }

}

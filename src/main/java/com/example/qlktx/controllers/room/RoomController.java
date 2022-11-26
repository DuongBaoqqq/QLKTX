package com.example.qlktx.controllers.room;

import com.example.qlktx.models.BEAN.Room;
import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RoomController", value = "/room")
public class RoomController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Room> rooms = RoomBO.getRooms();
        System.out.println(rooms.get(0).getName());
        req.setAttribute("rooms" , rooms.get(0));
    }
}

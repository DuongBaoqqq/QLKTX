package com.example.qlktx.controllers.room;

import com.example.qlktx.models.BEAN.Room;
import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RoomController", value = "/rooms")
public class RoomController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("username")==null) resp.sendRedirect(req.getContextPath()+"/CheckLoginServlet");
        else {
            String roomName = req.getParameter("room_name") == null ? "" : req.getParameter("room_name");
            boolean isAvailable = req.getParameter("available") != null;

            List<Room> rooms = RoomBO.getRooms(roomName, isAvailable);
            req.setAttribute("rooms", rooms);
            RequestDispatcher rd =
                    req.getRequestDispatcher("/rooms/rooms.jsp");
            rd.forward(req, resp);
        }
//        resp.sendRedirect("rooms.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        doGet(req, resp);
    }
}

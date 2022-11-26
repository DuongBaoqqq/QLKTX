package com.example.qlktx.models.BO;

import com.example.qlktx.models.BEAN.Room;
import com.example.qlktx.models.DAO.RoomDAO;

import java.util.List;

public class RoomBO {

    public static List<Room> getRooms() {
        return RoomDAO.getRooms();
    }
}

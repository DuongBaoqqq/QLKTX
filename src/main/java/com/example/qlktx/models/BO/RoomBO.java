package com.example.qlktx.models.BO;

import com.example.qlktx.models.BEAN.Room;
import com.example.qlktx.models.DAO.RoomDAO;

import java.util.List;

public class RoomBO {

    public static List<Room> getRooms(String roomName , boolean isAvailable) {
        return RoomDAO.getRooms(roomName , isAvailable);
    }

    public static void addNewRoom(int building_id , String name , int quantity) {
        RoomDAO.addNewRoom(building_id, name, quantity);
    }
}

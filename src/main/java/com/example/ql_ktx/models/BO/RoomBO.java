package com.example.ql_ktx.models.BO;

import com.example.ql_ktx.models.BEAN.Room;
import com.example.ql_ktx.models.DAO.RoomDAO;

import java.sql.SQLException;
import java.util.List;

public class RoomBO {
    public static List<Room> getRooms() {
        RoomDAO data = new RoomDAO();
        return data.getRooms();
    }

    public static void delRoom(int id)
    {
        RoomDAO.delRoom(id);
    }

    public static List<Room> seachRoom(String select, String txt)
    {
        return RoomDAO.searchRoom(select, txt);
    }
}

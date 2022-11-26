package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public static List<Room> getRooms() {

        try {
            String url = "jdbc:mysql://localhost:3306/ktx";
            String username = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String sql = "select * from room";

            ResultSet rs = stmt.executeQuery(sql);

            List<Room> rooms = new ArrayList<>();

            while (rs.next()) {
                // ... get column values from this record
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int building_id = rs.getInt("building_id");
                int quantity = rs.getInt("quantity");
                rooms.add(new Room(id, building_id, name, quantity));
            }


            return rooms;
        }catch (SQLException e) {
            throw new RuntimeException(e);
    }

    }

    public void addNewRoom(Room room) {

    }


}

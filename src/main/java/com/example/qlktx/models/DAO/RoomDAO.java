package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Room;
import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {

    public static @NotNull List<Room> getRooms() {
        String driverName = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://localhost:3306/ql_ktx";
            String username="root";
            String password="080101";

            Connection con = DriverManager.getConnection(url , username,password) ;

            Statement stmt = con.createStatement();

            ResultSet rs ;

            String sql = "select * from room";

            rs = stmt.executeQuery(sql);
            List<Room> Rooms = new ArrayList<Room>();
            while (rs.next()){
                Room room = new Room(
                        rs.getInt("id"),
                        rs.getInt("building_id"),
                        rs.getString("name"),
                        rs.getInt("quantity")
                        );
                Rooms.add(room);
            }
            return Rooms;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void addNewRoom(Room room) {

    }



    public static  void main(String args[]){
        RoomDAO rd= new RoomDAO();
        System.out.println(rd.getRooms().size());
//        rd.getRooms();
    }


}

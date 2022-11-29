package com.example.ql_ktx.models.DAO;

import com.example.ql_ktx.models.BEAN.Room;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
    public static List<Room> getRooms() {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "select room.id, room.name, building.name, room.quantity from room, building where room.building_id = building.id";

            ResultSet rs = stmt.executeQuery(sql);

            List<Room> rooms = new ArrayList<Room>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("room.name");
                String building_name = rs.getString("building.name");
                int quantity = rs.getInt("quantity");
                rooms.add(new Room(id, name, building_name, quantity));
            }

            return rooms;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }



    public static void delRoom(int id) {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "delete from room where id='" + id + "'";

            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Room> searchRoom(String select, String txt)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql=null;
            switch (select.trim())
            {
                case "ID":
                    sql = "select room.id, room.name, building.name, room.quantity from room, building where room.id like '%"+txt.trim()+"%' and room.building_id=building.id";
                case "Ten phong":
                    sql = "select room.id, room.name, building.name, room.quantity from room, building where room.name like '%"+txt.trim()+"%' and room.building_id=building.id";
                case "So luong":
                    sql = "select room.id, room.name, building.name, room.quantity from room, building where room.quantity like '%"+txt.trim()+"%' and room.building_id=building.id";
            }

            ResultSet rs = stmt.executeQuery(sql);

            List<Room> rooms = new ArrayList<Room>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("room.name");
                String building_name = rs.getString("building.name");
                int quantity = rs.getInt("quantity");
                rooms.add(new Room(id, name, building_name, quantity));
            }

            return rooms;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String args[])
    {
        RoomDAO rd = new RoomDAO();
        List<Room> rooms = rd.searchRoom("So luong", "3");
        for (Room r:rooms
             ) {
            System.out.println(r.getId());
            System.out.println(r.getName());
            System.out.println(r.getBuilding_name());
            System.out.println(r.getQuantity());
        }

    }

}

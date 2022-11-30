package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Room;
import org.jetbrains.annotations.NotNull;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RoomDAO {

  public static Statement createStatement() {
        try {
        String url = "jdbc:mysql://localhost:3306/ktx";
        String username = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, username, password);

        return con.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Room> getRooms(String roomName , boolean isAvailable) {

        try {
            System.out.println(roomName);
            Statement stmt = createStatement();
            String sql = "select room.id , room.name, building_id , quantity , building.name as building_name , count(student.id) as num_student from room " +
                    "inner join building on room.building_id = building.id " +
                    "left join student on student.room_id = room.id ";

            if(roomName != "") {
                sql += "where LOWER(room.name) like " + "LOWER(\'%" +  roomName + "%\')";
            }


            sql += "group by room.id";

            ResultSet rs = stmt.executeQuery(sql);

            String sql = "select * from room";


            while (rs.next()) {
                // ... get column values from this record
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int building_id = rs.getInt("building_id");
                int quantity = rs.getInt("quantity");
                int numStudent = rs.getInt("num_student");
                String buildingName = rs.getString("building_name");
                rooms.add(new Room(id, building_id, name, quantity , buildingName , numStudent));
            }

            if(isAvailable) {
                rooms =  rooms.stream().filter(x -> x.getNumStudent() < x.getQuantity()).collect(Collectors.toList());
            }

            return rooms;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void addNewRoom(int building_id , String name , int quantity) {
        try {
            System.out.println(building_id);
            System.out.println(name);
            System.out.println(quantity);
            Statement statement = createStatement();
            String sql = "insert into room(building_id , name , quantity)" +
                " values (" + building_id +",\'" + name + "\'," + quantity + ")" ;
            System.out.println(sql);
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    public static  void main(String args[]){
        RoomDAO rd= new RoomDAO();
        System.out.println(rd.getRooms().size());
//        rd.getRooms();
    }


}

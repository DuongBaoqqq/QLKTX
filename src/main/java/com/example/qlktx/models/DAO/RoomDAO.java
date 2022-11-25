package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Room;

import java.sql.*;
import java.util.List;

public class RoomDAO {

    public List<Room> getRooms() {
        String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
        try {
            Class.forName(driverName).newInstance();
            String url = "jdbc:odbc:qlktx";
            String username="root";
            String password="";

            Connection con = DriverManager.getConnection(url , username,password) ;

            Statement stmt = con.createStatement();

            ResultSet rs ;

            String sql = "select * from TABLE_NAME";

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


}

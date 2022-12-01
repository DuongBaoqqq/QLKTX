package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Constract;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConstractDAO {
    public static List<Constract> getAllContract(){
        try {
            String sql ="select * from contract";
            Statement stmt = ConnectDB.connectionDB();
            ResultSet rs = stmt.executeQuery(sql);
            List<Constract> list = new ArrayList<>();
            while (rs.next()){
                Constract constract = new Constract(
                        rs.getInt("id"),
                        rs.getInt("std_id"),
                        rs.getString("date_from"),
                        rs.getString("date_to")
                );
                list.add(constract);
            }
            return list;
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
}

package com.example.ql_ktx.models.DAO;

import com.example.ql_ktx.models.BEAN.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    public static Admin getAdmin(String username, String password)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "select * from admin";

            ResultSet rs = stmt.executeQuery(sql);

            List<Admin> admins = new ArrayList<Admin>();

            while (rs.next())
            {
                int id = rs.getInt("id");
                String user = rs.getString("username");
                String pass = rs.getString("password");
                admins.add(new Admin(id, user, pass));
            }
            for (Admin a: admins
                 ) {
                if (a.getUsername().trim().equals(username.trim()) && a.getPassword().trim().equals(password.trim()))
                    return  a;
            }
            return null;
        }catch (SQLException e) {
            throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertAdmin(String username, String password)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "insert into admin (username, password) values('"+username.trim()+"', '"+password.trim()+"')";

            stmt.executeUpdate(sql);
        }catch (SQLException e) {
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

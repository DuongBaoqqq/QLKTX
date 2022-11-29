package com.example.ql_ktx.models.DAO;

import com.example.ql_ktx.models.BEAN.Room;
import com.example.ql_ktx.models.BEAN.Staff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {
    public static List<Staff> getStaffs()
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "select * from staff";

            ResultSet rs = stmt.executeQuery(sql);

            List<Staff> staffs = new ArrayList<Staff>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int sex = rs.getInt("sex");
                String phone_number = rs.getString("sdt");
                Date date = rs.getDate("date");
                String role = rs.getString("role");
                staffs.add(new Staff(id, name, sex, phone_number, date, role));
            }

            return staffs;
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

    public static List<Staff> searchStaffs(String txt)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "select * from staff where name like'%"+txt.trim()+"%'";

            ResultSet rs = stmt.executeQuery(sql);

            List<Staff> staffs = new ArrayList<Staff>();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int sex = rs.getInt("sex");
                String phone_number = rs.getString("sdt");
                Date date = rs.getDate("date");
                String role = rs.getString("role");
                staffs.add(new Staff(id, name, sex, phone_number, date, role));
            }

            return staffs;
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

    public static void deleteStaff(int id)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "delete from staff where id='" + id + "'";

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

    public static void addStaff(String name, int sex, String phone_number, Date date, String role)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "insert into staff (name, sex, sdt, date, role) values('" + name.trim() + "', "+sex+", '"+phone_number.trim()+"', '"+date+"', '"+role.trim()+"')";

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

    public static void updateStaff(int id, String name, int sex, String phone_number, Date date, String role)
    {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName).newInstance();
            String url = "jdbc:mysql://127.0.0.1:3306/ql_ktx";
            String u = "root";
            String p = "";

            Connection con = DriverManager.getConnection(url, u, p);

            Statement stmt = con.createStatement();

            String sql = "update staff set name='" + name.trim() + "', sex='"+sex+"', sdt='"+phone_number.trim()+"', date='"+date+"', role='"+role.trim()+"' where id='"+id+"'";

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

    public static void main(String args[])
    {
        StaffDAO rd = new StaffDAO();
        List<Staff> staffs = rd.searchStaffs("N");
        for (Staff s:staffs
             ) {
            System.out.println(s.getName());
        }
    }
}

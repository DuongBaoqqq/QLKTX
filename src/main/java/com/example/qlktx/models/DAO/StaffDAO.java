package com.example.qlktx.models.DAO;

import com.example.qlktx.models.BEAN.Staff;

import java.sql.*;
import java.util.*;

public class StaffDAO {
    public static List<Staff> getAllStaff() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "select * from staff";
        List<Staff> list = new ArrayList<>();
        Statement stmt = ConnectDB.connectionDB();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            Staff staff = new Staff(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getBoolean("sex"),
                    rs.getString("sdt"),
                    rs.getDate("date").toString(),
                    rs.getString("role")
            );
            list.add(staff);
        }
        return list;
    }
    public static void updateStaff(Staff staff) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "update staff set name= '" + staff.getName()+"', sex = '" +(staff.isSex()==true?1:0)+
                "', sdt= '"+ staff.getPhonenumber() + "', date = '" + staff.getDate() +"', role ='"+staff.getRole()+
                "' where id =" +staff.getId();
        Statement stmt = ConnectDB.connectionDB();
        stmt.executeUpdate(sql);
    }
    public static List<Staff> searchStaff(String type, String search) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "select * from staff where "+ type+ " like '%"+search+"%'";
        List<Staff> list = new ArrayList<>();
        Statement stmt = ConnectDB.connectionDB();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            Staff staff = new Staff(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getBoolean("sex"),
                    rs.getString("sdt"),
                    rs.getDate("date").toString(),
                    rs.getString("role")
            );
            list.add(staff);
        }
        return list;
    }
    public static void addStaff(Staff staff) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "insert into staff (name,sex,sdt,date,role) values ('"+staff.getName()+"',"+(staff.isSex()==true?1:0)+
                ",'"+staff.getPhonenumber() + "','"+ staff.getDate()+"','"+ staff.getRole()+"')";
        Statement stmt = ConnectDB.connectionDB();
        stmt.executeUpdate(sql);
    }
    public static void delStaff(int id) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        String sql = "delete from staff where id ="+id;
        Statement stmt = ConnectDB.connectionDB();
        stmt.executeUpdate(sql);
    }

//    public static void main(String args[]){
//        try {
//            StaffDAO std= new StaffDAO();
//            List<Staff> l =std.searchStaff("name","NV");
//            System.out.println(l.get(0).getName());
//        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//            throw new RuntimeException(e);
//        }
//    }
}

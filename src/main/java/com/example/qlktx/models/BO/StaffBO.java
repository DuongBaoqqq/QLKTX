package com.example.qlktx.models.BO;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.DAO.StaffDAO;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StaffBO {

    public static List<Staff> getAllStaff() {
        try {
            return StaffDAO.getAllStaff();
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
    public static int getSize(){
        return getAllStaff().size();
    }
    public static Staff getStaffByID(int id) {
        List<Staff> staffs= new ArrayList<Staff>();
        staffs = getAllStaff();
        for(int i=0; i< staffs.size();i++){
            if(staffs.get(i).getId()==id)
                return staffs.get(i);
        }
        return null;
    }
    public  static void updateStaff(Staff staff) {
        try {
            StaffDAO.updateStaff(staff);
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
    public static void addStaff(Staff staff){
        try {
            StaffDAO.addStaff(staff);
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
    public static void delStaff(int id){
        try {
            StaffDAO.delStaff(id);
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
    public static List<Staff> SearchStaff(String type, String search){
        try {
            return StaffDAO.searchStaff(type,search);
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
//    public  static void main(String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        StaffBO sb = new StaffBO();
//        System.out.println(sb.getStaffByID(1).getName());
//    }
}

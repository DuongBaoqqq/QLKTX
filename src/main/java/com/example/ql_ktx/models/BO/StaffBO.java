package com.example.ql_ktx.models.BO;

import com.example.ql_ktx.models.BEAN.Staff;
import com.example.ql_ktx.models.DAO.StaffDAO;

import java.sql.Date;
import java.util.List;

public class StaffBO {
    public static List<Staff> getStaffs()
    {
        return StaffDAO.getStaffs();
    }

    public static List<Staff>searchStaffs(String txt)
    {
        return StaffDAO.searchStaffs(txt);
    }

    public static void deleteStaff(int id)
    {
        StaffDAO.deleteStaff(id);
    }

    public static void addStaff(String name, int sex, String phone_number, Date date, String role)
    {
        StaffDAO.addStaff(name, sex, phone_number, date, role);
    }

    public static void updateStaff(int id, String name, int sex, String phone_number, Date date, String role)
    {
        StaffDAO.updateStaff(id, name, sex, phone_number, date, role);
    }
}

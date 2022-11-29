package com.example.ql_ktx.models.BO;

import com.example.ql_ktx.models.BEAN.Admin;
import com.example.ql_ktx.models.DAO.AdminDAO;

import java.util.List;

public class AdminBO {
    public static Admin getAdmin(String username, String password)
    {
        return AdminDAO.getAdmin(username, password);
    }

    public static void insertAdmin(String username, String password)
    {
        AdminDAO.insertAdmin(username, password);
    }
}

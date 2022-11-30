package com.example.qlktx.models.BO;

import com.example.qlktx.models.BEAN.Admin;
import com.example.qlktx.models.DAO.AdminDAO;
import com.example.qlktx.models.BEAN.Admin;
import com.example.qlktx.models.DAO.AdminDAO;

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

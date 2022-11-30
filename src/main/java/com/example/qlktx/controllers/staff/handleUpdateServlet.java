package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "handleUpdateServlet", value = "/handleUpdateServlet")
public class handleUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        boolean sex = (request.getParameter("sex") == "true" ? true : false);
        String phone = request.getParameter("phonenumber");
        String date=request.getParameter("date");
        String role = request.getParameter("role");
        Staff staff = new Staff(id, name, sex, phone, date, role);
        StaffBO.updateStaff(staff);
        RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/index.jsp");
        rd.forward(request,response);
    }
}

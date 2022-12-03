package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "staffServlet", value = "/staffServlet")
public class staffServlet extends HttpServlet {
    StaffBO data;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getSession().getAttribute("username")==null) response.sendRedirect(request.getContextPath()+"/CheckLoginServlet");
        else {
            List<Staff> Staffs = new ArrayList<Staff>();
            Staffs = StaffBO.getAllStaff();
            request.setAttribute("staffs", Staffs);
            String destination = "/staffs/staff.jsp";
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher(destination);
            rd.forward(request, response);
        }
    }
}

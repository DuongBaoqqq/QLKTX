package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

@WebServlet(name = "updateStaffServlet", value = "/updateStaffServlet")
public class updateStaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
            Staff staff = StaffBO.getStaffByID(id);
            if(staff!= null){
                request.setAttribute("staff",staff);
                String destination ="/updateStaff.jsp";
                RequestDispatcher rd = request.getServletContext().getRequestDispatcher(destination);
                rd.forward(request,response);
            }

    }
}

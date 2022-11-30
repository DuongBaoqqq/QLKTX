package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "staffControllerServlet", value = "/staffControllerServlet")
public class staffControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("addStaff")!=null){
            Staff staff = new Staff(
                    request.getParameter("name"),
                    (request.getParameter("sex").equals("true") ? true: false),
                    request.getParameter("phonenumber"),
                    request.getParameter("date"),
                    request.getParameter("role")
            );
            StaffBO.addStaff(staff);
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request,response);
        }
        else if (request.getParameter("updateStaff")!=null){
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            boolean sex = ((request.getParameter("sex").equals("true")) ? true : false);
            String phone = request.getParameter("phonenumber");
            String date=request.getParameter("date");
            String role = request.getParameter("role");
            Staff staff = new Staff(id, name, sex, phone, date, role);
            StaffBO.updateStaff(staff);
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request,response);
        }
        else if(request.getParameter("searchStaff")!=null){
            String type = request.getParameter("radio");
            String search = request.getParameter("search");
            List<Staff> staffs = new ArrayList<>();
            staffs = StaffBO.SearchStaff(type,search);
            request.setAttribute("staffs",staffs);
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/staff.jsp");
            rd.forward(request,response);
        }
    }
}

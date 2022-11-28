package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addStaffServlet", value = "/addStaffServlet")
public class addStaffServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("submitAdd")!=null){
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/addStaff.jsp");
            rd.forward(request,response);
        }
        else {
            String[] ids = request.getParameterValues("del");
            for(String id: ids){
                StaffBO.delStaff(Integer.parseInt(id));
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request,response);
        }

    }
}

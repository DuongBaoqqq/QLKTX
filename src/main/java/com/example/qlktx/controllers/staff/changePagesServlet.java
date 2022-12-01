package com.example.qlktx.controllers.staff;

import com.example.qlktx.models.BEAN.Staff;
import com.example.qlktx.models.BO.StaffBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "changePagesServlet", value = "/changePagesServlet")
public class changePagesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id")!=null){
            int id = Integer.parseInt(request.getParameter("id"));
            Staff staff = StaffBO.getStaffByID(id);
            if(staff!= null){
                request.setAttribute("staff",staff);
                String destination ="/updateStaff.jsp";
                RequestDispatcher rd = request.getServletContext().getRequestDispatcher(destination);
                rd.forward(request,response);
            }
        }
        else {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/searchStaff.jsp");
            rd.forward(request,response);
        }
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
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/rooms.jsp");
            rd.forward(request,response);
        }
    }
}

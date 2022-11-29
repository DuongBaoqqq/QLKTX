package com.example.ql_ktx.controllers;

import com.example.ql_ktx.models.BEAN.Admin;
import com.example.ql_ktx.models.BO.AdminBO;
import com.example.ql_ktx.models.BO.RoomBO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet()
    {
        super();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        Admin a = AdminBO.getAdmin(user, pass);
        if (a != null)
        {
            request.setAttribute("rooms", RoomBO.getRooms());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
            request.getSession().setAttribute("user", a.getUsername());
        }
        else {
            //RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
            //rd.forward(request, response);
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<div> Invalid username and password </div>");
            out.println("<div> <a href=\"Login.jsp\"> Try Again </a> </div>");
            out.println("<div> <a href=\"Register.jsp\"> Create New Account ? </a> </div>");
            out.println("</body></html>");
        }

    }
}
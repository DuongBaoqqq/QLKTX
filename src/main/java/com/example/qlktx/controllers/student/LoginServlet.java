package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BEAN.Admin;
import com.example.qlktx.models.BO.AdminBO;
import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        Admin a = AdminBO.getAdmin(user, pass);
        if (a != null)
        {
            request.setAttribute("rooms", RoomBO.getRooms("", false));
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/rooms.jsp");
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

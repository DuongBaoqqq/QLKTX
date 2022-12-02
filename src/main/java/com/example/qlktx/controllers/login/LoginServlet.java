package com.example.qlktx.controllers.login;

import com.example.qlktx.models.BEAN.Admin;
import com.example.qlktx.models.BO.AdminBO;
import com.example.qlktx.models.BO.RoomBO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
            request.setAttribute("rooms", RoomBO.getRooms("", false));
            request.getSession().setAttribute("username", a.getUsername());
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
        else {
            //RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
            //rd.forward(request, response);
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<div> Invalid username and password </div>");
            out.println("<div> <a href=\"CheckLoginServlet\"> Try Again </a> </div>");
            out.println("<div> <a href=\"ToRegisterServlet\"> Create New Account ? </a> </div>");
            out.println("</body></html>");
        }

    }
}

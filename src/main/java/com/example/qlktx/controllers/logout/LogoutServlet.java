package com.example.qlktx.controllers.logout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LogoutServlet", value = "/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
//        RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.jsp");
//        rd.forward(request, response);

        response.sendRedirect(request.getContextPath() + "/CheckLoginServlet");
    }
}

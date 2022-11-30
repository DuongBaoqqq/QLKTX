package com.example.qlktx.controllers.student;

import com.example.qlktx.models.BO.AdminBO;
import com.example.qlktx.models.BO.AdminBO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        AdminBO.insertAdmin(username, password);
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<div> You are having new Account now ! </div>");
        out.println("<div> <a href=\"Login.jsp\"> Back to Login </a> </div>");
        out.println("</body></html>");
    }
}

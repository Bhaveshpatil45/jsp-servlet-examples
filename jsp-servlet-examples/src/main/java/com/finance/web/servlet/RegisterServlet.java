package com.finance.web.servlet;


import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_management", "root", "password")) {
            PreparedStatement ps = con.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
            ps.setString(1, username);
            ps.setString(2, password); // Note: Hash passwords for production
            ps.executeUpdate();
            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("Error: " + e.getMessage());
        }
    }
}


package com.financeManagement.web.servlet.Controllers;


import com.finance.models.User;
import com.finance.services.UserService;
import com.finance.exceptions.UserNotFoundException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            User user = userService.authenticate(username, password);
            request.getSession().setAttribute("user", user);
            response.sendRedirect("dashboard.jsp");
        } catch (UserNotFoundException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

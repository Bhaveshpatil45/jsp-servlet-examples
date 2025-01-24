package com.financeManagement.web.servlet.Controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Assuming you have a UserService for authentication
import com.financeManagement.web.servlet.services.UserService;
import com.financeManagement.web.servlet.models.User;

import java.io.IOException;

@WebServlet("/auth")
public class AuthController extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserService(); // Initialize your UserService here
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            // Authenticate user
            User user = userService.authenticate(username, password);

            // Save user to session
            request.getSession().setAttribute("user", user);

            // Redirect to dashboard
            response.sendRedirect("dashboard.jsp");

        } catch (Exception e) {
            // If authentication fails, forward back to login page with error
            request.setAttribute("error", "Invalid username or password.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}

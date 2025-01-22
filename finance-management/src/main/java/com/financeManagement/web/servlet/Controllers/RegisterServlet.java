package com.financeManagement.web.servlet.Controllers;

import com.financeManagement.web.servlet.models.User;
import com.financeManagement.web.servlet.services.UserService;
import com.financeManagement.web.servlet.exceptions.UserAlreadyExistsException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private UserService userService = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        try {
            userService.register(new User(0, username, password, null, "User", "Active"));
            response.sendRedirect("login.jsp");
        } catch (UserAlreadyExistsException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
    }
}
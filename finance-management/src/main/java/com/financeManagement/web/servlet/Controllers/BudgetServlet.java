package com.financeManagement.web.servlet.Controllers;


import com.financeManagement.web.servlet.models.Budget;
import com.financeManagement.web.servlet.models.User;
import com.financeManagement.web.servlet.services.BudgetService;
import com.financeManagement.web.servlet.exceptions.BudgetExceededException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/budget")
public class BudgetServlet extends HttpServlet {
    private BudgetService budgetService = new BudgetService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String category = request.getParameter("category");
        double amount = Double.parseDouble(request.getParameter("amount"));
        int month = Integer.parseInt(request.getParameter("month"));
        int year = Integer.parseInt(request.getParameter("year"));

        User user = (User) request.getSession().getAttribute("user");

        Budget budget = new Budget(0, category, amount, month, year, user);

        try {
            budgetService.setBudget(budget);
            response.sendRedirect("budget.jsp");
        } catch (BudgetExceededException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("budget.jsp").forward(request, response);
        }
    }
}

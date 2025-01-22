package com.financeManagement.web.servlet.Controllers;

import com.finance.models.Transaction;
import com.finance.services.TransactionService;
import com.finance.exceptions.TransactionNotFoundException;
import com.finance.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/transaction")
public class TransactionServlet extends HttpServlet {
    private TransactionService transactionService = new TransactionService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        String category = request.getParameter("category");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String description = request.getParameter("description");

        User user = (User) request.getSession().getAttribute("user");
        Date date = new Date();

        Transaction transaction = new Transaction(0, amount, type, category, date, description, user);

        try {
            transactionService.addTransaction(transaction);
            response.sendRedirect("transactions.jsp");
        } catch (TransactionNotFoundException e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("transactions.jsp").forward(request, response);
        }
    }
}


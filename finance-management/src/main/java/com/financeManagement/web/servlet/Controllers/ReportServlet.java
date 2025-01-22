package com.financeManagement.web.servlet.Controllers;

import com.finance.services.ReportService;
import com.finance.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/report")
public class ReportServlet extends HttpServlet {
    private ReportService reportService = new ReportService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute("user");
        String reportType = request.getParameter("type");

        try {
            String reportData = reportService.generateReport(reportType, user);
            request.setAttribute("reportData", reportData);
            request.getRequestDispatcher("reports.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("reports.jsp").forward(request, response);
        }
    }
}

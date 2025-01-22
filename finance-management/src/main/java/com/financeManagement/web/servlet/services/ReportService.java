package com.financeManagement.web.servlet.services;

import com.financeManagement.web.servlet.models.Report;
import com.financeManagement.web.servlet.models.User;

public class ReportService {

    public String generateReport(String reportType, User user) {
        if ("monthly".equals(reportType)) {
            return generateMonthlyReport(user);
        } else if ("categoryWise".equals(reportType)) {
            return generateCategoryWiseReport(user);
        } else {
            throw new IllegalArgumentException("Invalid report type");
        }
    }

    private String generateMonthlyReport(User user) {
        // Example report generation logic for monthly
        return "Monthly income/expense report for user: " + user.getUsername();
    }

    private String generateCategoryWiseReport(User user) {
        // Example report generation logic for category-wise
        return "Category-wise income/expense report for user: " + user.getUsername();
    }
}

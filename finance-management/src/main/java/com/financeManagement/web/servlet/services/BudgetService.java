package com.financeManagement.web.servlet.services;

import com.financeManagement.web.servlet.models.Budget;
import com.financeManagement.web.servlet.exceptions.BudgetExceededException;

import java.util.HashMap;
import java.util.Map;

public class BudgetService {
    private static Map<Integer, Budget> budgetDatabase = new HashMap<>();

    public void setBudget(Budget budget) throws BudgetExceededException {
        double totalExpense = getTotalExpenseForCategory(budget.getCategory());
        if (totalExpense + budget.getAmount() > budget.getAmount()) {
            throw new BudgetExceededException("Budget exceeded for category: " + budget.getCategory());
        }
        budgetDatabase.put(budget.getId(), budget);
    }

    public Budget getBudgetByCategoryAndMonth(int userId, String category, int month, int year) {
        for (Budget budget : budgetDatabase.values()) {
            if (budget.getUser().getId() == userId && budget.getCategory().equals(category)
                    && budget.getMonth() == month && budget.getYear() == year) {
                return budget;
            }
        }
        return null;
    }

    public double getTotalExpenseForCategory(String category) {
        double totalExpense = 0;
        for (Budget budget : budgetDatabase.values()) {
            if (budget.getCategory().equals(category)) {
                totalExpense += budget.getAmount();
            }
        }
        return totalExpense;
    }
}


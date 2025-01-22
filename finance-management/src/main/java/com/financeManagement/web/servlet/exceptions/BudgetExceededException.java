package com.financeManagement.web.servlet.exceptions;

public class BudgetExceededException extends Exception {
    public BudgetExceededException(String message) {
        super(message);
    }
}
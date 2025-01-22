package com.financeManagement.web.servlet.utils;

public class InputValidator {

    // Method to validate if a string is a valid username (alphanumeric)
    public static boolean isValidUsername(String username) {
        return username != null && username.matches("[a-zA-Z0-9]{3,}");
    }

    // Method to validate if the provided amount is positive
    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }

    // Method to validate if the input email format is correct
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Method to validate if a transaction type is either "Income" or "Expense"
    public static boolean isValidTransactionType(String type) {
        return "Income".equalsIgnoreCase(type) || "Expense".equalsIgnoreCase(type);
    }

    // Method to check if a string is not empty
    public static boolean isNotEmpty(String input) {
        return input != null && !input.trim().isEmpty();
    }
}

package com.financeManagement.web.servlet.utils;

public class CategoryUtils {

    // Example of a simple category validation
    public static boolean isValidCategory(String category) {
        String[] validCategories = {"Groceries", "Rent", "Entertainment", "Utilities", "Salary"};
        for (String validCategory : validCategories) {
            if (validCategory.equalsIgnoreCase(category)) {
                return true;
            }
        }
        return false;
    }
}

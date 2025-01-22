package com.financeManagement.web.servlet.utils;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtils {

    private static final Logger logger = Logger.getLogger(LoggerUtils.class.getName());

    // Method to log info messages
    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    // Method to log error messages
    public static void logError(String message) {
        logger.log(Level.SEVERE, message);
    }

    // Method to log warning messages
    public static void logWarning(String message) {
        logger.log(Level.WARNING, message);
    }
}

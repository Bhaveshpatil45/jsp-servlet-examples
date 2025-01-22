package com.financeManagement.web.servlet.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    // Method to format a Date object into a string
    public static String formatDate(Date date) {
        return dateFormat.format(date);
    }

    // Method to parse a string into a Date object
    public static Date parseDate(String dateStr) throws Exception {
        return dateFormat.parse(dateStr);
    }

    // Method to get the current date as a string
    public static String getCurrentDate() {
        return formatDate(new Date());
    }
}

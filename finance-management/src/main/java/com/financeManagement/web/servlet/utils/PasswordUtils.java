package com.financeManagement.web.servlet.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtils {

    // Method to hash a password using SHA-256
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = messageDigest.digest(password.getBytes());
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    // Method to validate the password by comparing hash
    public static boolean validatePassword(String inputPassword, String storedHashedPassword) throws NoSuchAlgorithmException {
        return storedHashedPassword.equals(hashPassword(inputPassword));
    }
}

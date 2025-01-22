package com.financeManagement.web.servlet.exceptions;

public class DuplicateTransactionException extends Exception {
    public DuplicateTransactionException(String message) {
        super(message);
    }
}

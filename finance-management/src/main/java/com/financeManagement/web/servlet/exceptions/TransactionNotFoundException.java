package com.financeManagement.web.servlet.exceptions;

public class TransactionNotFoundException extends Exception{
    public TransactionNotFoundException(String message) {
        super(message);
    }
}

package com.financeManagement.web.servlet.services;

import com.financeManagement.web.servlet.models.Transaction;
import com.financeManagement.web.servlet.exceptions.TransactionNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) throws TransactionNotFoundException {
        if (transaction == null) {
            throw new TransactionNotFoundException("Transaction cannot be null");
        }
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

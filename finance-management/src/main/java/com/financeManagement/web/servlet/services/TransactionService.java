package com.financeManagement.web.servlet.services;

import com.finance.models.Transaction;
import com.finance.exceptions.TransactionNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private static List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactionsByUser(int userId) {
        List<Transaction> userTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getUser().getId() == userId) {
                userTransactions.add(transaction);
            }
        }
        return userTransactions;
    }

    public Transaction getTransactionById(int transactionId) throws TransactionNotFoundException {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                return transaction;
            }
        }
        throw new TransactionNotFoundException("Transaction not found.");
    }
}

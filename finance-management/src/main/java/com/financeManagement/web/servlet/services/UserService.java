package com.financeManagement.web.servlet.services;

import com.finance.models.User;
import com.finance.exceptions.UserAlreadyExistsException;
import com.finance.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<String, User> userDatabase = new HashMap<>();

    public User authenticate(String username, String password) throws UserNotFoundException {
        User user = userDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        throw new UserNotFoundException("Invalid username or password.");
    }

    public void register(User user) throws UserAlreadyExistsException {
        if (userDatabase.containsKey(user.getUsername())) {
            throw new UserAlreadyExistsException("Username already exists.");
        }
        userDatabase.put(user.getUsername(), user);
    }
}
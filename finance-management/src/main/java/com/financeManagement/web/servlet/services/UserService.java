package com.financeManagement.web.servlet.services;

import com.financeManagement.web.servlet.exceptions.UserNotFoundException;
import com.financeManagement.web.servlet.models.User;
import com.financeManagement.web.servlet.exceptions.UserAlreadyExistsException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private static Map<String, User> users = new HashMap<>();

    // Register method with validation for existing user
    public void register(User user) throws UserAlreadyExistsException {
        if (users.containsKey(user.getUsername())) {
            throw new UserAlreadyExistsException("Username already exists");
        }
        users.put(user.getUsername(), user);
    }

    // Authenticate method
    public User authenticate(String username, String password) throws UserNotFoundException {
        User user = users.get(username);
        if (user == null || !user.getPassword().equals(password)) {
            throw new UserNotFoundException("Invalid username or password");
        }
        return user;
    }
}

package com.financeManagement.web.servlet.services;

import com.finance.models.User;
import com.finance.utils.DatabaseUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {
    public User authenticate(String username, String password) throws Exception {
        Connection conn = DatabaseUtil.getConnection();
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return new User(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("password"),
                    null,
                    "User",
                    rs.getString("state")
            );
        } else {
            throw new Exception("Invalid username or password");
        }
    }

    public void register(User user) throws Exception {
        Connection conn = DatabaseUtil.getConnection();
        String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, "test@example.com");
        stmt.executeUpdate();
    }
}

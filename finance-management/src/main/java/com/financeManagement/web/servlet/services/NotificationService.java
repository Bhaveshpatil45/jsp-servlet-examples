package com.financeManagement.web.servlet.services;

import com.finance.models.Notification;
import com.finance.models.User;
import com.finance.exceptions.NotificationFailureException;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private static List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public List<Notification> getNotificationsForUser(User user) {
        List<Notification> userNotifications = new ArrayList<>();
        for (Notification notification : notifications) {
            if (notification.getUser().getId() == user.getId()) {
                userNotifications.add(notification);
            }
        }
        return userNotifications;
    }

    public void sendNotification(User user, String message, String type) throws NotificationFailureException {
        try {
            Notification notification = new Notification(0, message, type, new java.util.Date(), user);
            addNotification(notification);
        } catch (Exception e) {
            throw new NotificationFailureException("Failed to send notification.");
        }
    }
}

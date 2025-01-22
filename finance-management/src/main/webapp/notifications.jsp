<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notifications</title>
</head>
<body>
    <div class="notifications-container">
        <h2>Your Notifications</h2>
        <table>
            <tr>
                <th>Message</th>
                <th>Type</th>
                <th>Date</th>
            </tr>
            <c:forEach var="notification" items="${notifications}">
                <tr>
                    <td>${notification.message}</td>
                    <td>${notification.type}</td>
                    <td>${notification.date}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

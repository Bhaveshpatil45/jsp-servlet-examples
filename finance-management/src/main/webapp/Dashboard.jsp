<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="dashboard-container">
        <h2>Welcome, ${user.username}!</h2>
        <nav>
            <ul>
                <li><a href="addTransaction.jsp">Add Transaction</a></li>
                <li><a href="viewTransactions.jsp">View Transactions</a></li>
                <li><a href="addBudget.jsp">Set Budget</a></li>
                <li><a href="viewBudget.jsp">View Budget</a></li>
                <li><a href="generateReport.jsp">Generate Reports</a></li>
                <li><a href="notifications.jsp">Notifications</a></li>
            </ul>
        </nav>
    </div>
</body>
</html>

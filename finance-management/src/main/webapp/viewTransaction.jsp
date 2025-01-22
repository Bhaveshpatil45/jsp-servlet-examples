<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Transactions</title>
</head>
<body>
    <div class="transactions-container">
        <h2>Your Transactions</h2>
        <table>
            <tr>
                <th>Amount</th>
                <th>Type</th>
                <th>Category</th>
                <th>Description</th>
            </tr>
            <c:forEach var="transaction" items="${transactions}">
                <tr>
                    <td>${transaction.amount}</td>
                    <td>${transaction.type}</td>
                    <td>${transaction.category}</td>
                    <td>${transaction.description}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

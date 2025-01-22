<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Budget</title>
</head>
<body>
    <div class="budget-container">
        <h2>Your Budget</h2>
        <table>
            <tr>
                <th>Category</th>
                <th>Amount</th>
                <th>Month</th>
                <th>Year</th>
            </tr>
            <c:forEach var="budget" items="${budgets}">
                <tr>
                    <td>${budget.category}</td>
                    <td>${budget.amount}</td>
                    <td>${budget.month}</td>
                    <td>${budget.year}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>

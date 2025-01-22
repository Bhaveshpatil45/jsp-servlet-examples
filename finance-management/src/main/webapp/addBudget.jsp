<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Budget</title>
</head>
<body>
    <div class="budget-container">
        <h2>Set Monthly Budget</h2>
        <form action="addBudget" method="POST">
            <input type="text" name="category" placeholder="Category" required>
            <input type="number" name="amount" placeholder="Amount" required>
            <button type="submit">Set Budget</button>
        </form>
    </div>
</body>
</html>

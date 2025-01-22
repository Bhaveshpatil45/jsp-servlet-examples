<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Transaction</title>
</head>
<body>
    <div class="transaction-container">
        <h2>Add Transaction</h2>
        <form action="addTransaction" method="POST">
            <input type="number" name="amount" placeholder="Amount" required>
            <select name="type" required>
                <option value="Income">Income</option>
                <option value="Expense">Expense</option>
            </select>
            <input type="text" name="category" placeholder="Category" required>
            <input type="text" name="description" placeholder="Description">
            <button type="submit">Add Transaction</button>
        </form>
    </div>
</body>
</html>

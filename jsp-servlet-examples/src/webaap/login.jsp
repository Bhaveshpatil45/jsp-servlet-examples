<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <form action="login" method="POST">
        Username: <input type="text" name="username" /><br>
        Password: <input type="password" name="password" /><br>
        <input type="submit" value="Login" />
    </form>
    <c:if test="${param.error != null}">
        <p style="color:red">Invalid username or password!</p>
    </c:if>
</body>
</html>

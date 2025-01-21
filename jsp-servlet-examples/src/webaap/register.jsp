<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <form action="register" method="POST">
        Username: <input type="text" name="username" /><br>
        Password: <input type="password" name="password" /><br>
        <input type="submit" value="Register" />
    </form>
    <c:if test="${param.error != null}">
        <p style="color:red">Registration failed. Try again!</p>
    </c:if>
</body>
</html>

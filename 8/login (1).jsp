<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login Page</title>
</head>
<body>
<h1>Login</h1>
<form action="login" method="post">
  <%--@declare id="username"--%><%--@declare id="password"--%><label for="username">Username:</label>
  <input type="text" name="username" required>
  <br>
  <label for="password">Password:</label>
  <input type="password" name="password" required>
  <br>
  <input type="submit" value="Login">
</form>
</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
</head>
<body>
<h1>Welcome back ma man </h1>
<p>You finally log like this : <%= session.getAttribute("username") %></p>
<form action="/logout" method="post">
    <input type="submit" value="Logout">
</form>
</body>
</html>